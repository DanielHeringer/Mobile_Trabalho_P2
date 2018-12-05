package danielheringer.prova_mobile.CenarioListaRefeicoes

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.text.Html
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import danielheringer.prova_mobile.CenarioDetalhes.Detalhes
import danielheringer.prova_mobile.Entidades.Meal
import danielheringer.prova_mobile.GlideApp
import danielheringer.prova_mobile.R
import kotlinx.android.synthetic.main.activity_lista_refeicoes.*

class ListaRefeicoes  : AppCompatActivity(), ListaRefeicoes_Contract.View {

    val presenter: ListaRefeicoes_Contract.Presenter =  ListaRefeicoes_Presenter(this)
    var s : String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_refeicoes)


        GlideApp.with(this)
            .load("http://valefood.com.br/images/loader.gif")
            .placeholder(R.drawable.loading)
            .into(loadingGif)


        presenter.onAtualizaLista(s, false)


    }

    override fun onCreateOptionsMenu(menu : Menu): Boolean {
        getMenuInflater().inflate(R.menu.lista, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            R.id.shuffle -> {
                random()
                return true
            }
            R.id.home -> {
                presenter.onAtualizaLista(s, false)
            return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun showProgressBar() {
        loading.setVisibility(View.VISIBLE)
    }

    override fun hideProgressBar() {
        loading.setVisibility(View.GONE)
    }

    override fun showMsg(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }

    override fun random() {
        presenter.onAtualizaLista(s, true)
    }
    override fun openYoutubeLink(youtubeURL: String){
        val uri = Uri.parse(youtubeURL)
        val intentBrowser = Intent(Intent.ACTION_VIEW, uri)
        this.startActivity(intentBrowser)
    }


    override fun exibeLista(lista: List<Meal>) {
        val adapter = ListaRefeicoesAdapter(this, lista, { dificuldadeItem : Meal -> itemClique(dificuldadeItem) }, {yt: String -> openYoutubeLink(yt)} )
        val layoutManager = LinearLayoutManager(this)

        Rv.adapter = adapter
        Rv.layoutManager = layoutManager
    }


    override fun itemClique(refeicao:Meal){
        val DetalhesReceita = Intent(this, Detalhes::class.java)
        DetalhesReceita.putExtra("refeicao",refeicao)
        startActivityForResult(DetalhesReceita, 1)
    }

}
