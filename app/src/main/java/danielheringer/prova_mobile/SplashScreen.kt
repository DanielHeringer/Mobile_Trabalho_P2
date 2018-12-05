package danielheringer.prova_mobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.os.HandlerCompat.postDelayed
import android.content.Intent
import danielheringer.prova_mobile.CenarioListaRefeicoes.ListaRefeicoes
import kotlinx.android.synthetic.main.activity_splash_screen.*


class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        GlideApp.with(this)
            .asGif()
            .load("https://steemitimages.com/p/3W72119s5BjWMGm4Xa2MvD5AT2bJsSA8F9WeC71v1s1fKfGkK9mMKuc3LcvF4KigbWg9UsrpEPGCQn7BnNWJjahFj5qAtgivKY7dLqSbAavy2qBjHtcemK?format=match&mode=fit")
            .into(imgView)

        val handle = Handler()
        handle.postDelayed(Runnable {abrirLista()}, 2500)
    }

    fun abrirLista(){
        val intent = Intent(this, ListaRefeicoes::class.java)
        startActivity(intent)
        finish()
    }
}
