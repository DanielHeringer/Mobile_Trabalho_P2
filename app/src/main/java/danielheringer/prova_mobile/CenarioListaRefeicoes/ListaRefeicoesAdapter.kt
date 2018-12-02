package danielheringer.prova_mobile.CenarioListaRefeicoes

import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import danielheringer.prova_mobile.Entidades.Meal
import danielheringer.prova_mobile.GlideApp
import danielheringer.prova_mobile.R
import kotlinx.android.synthetic.main.item_refeicao.view.*
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestOptions



class ListaRefeicoesAdapter (val context: Context, val meals: List<Meal>, val clickListener: (Meal) -> Unit, val youtube: (String) -> Unit) : RecyclerView.Adapter<ListaRefeicoesAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_refeicao, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return meals.size
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(meals[position], clickListener, context, youtube)
    }



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @RequiresApi(Build.VERSION_CODES.O)
        fun bindView(meal: Meal, clickListener: (Meal) -> Unit, context: Context, openYoutube: (String) -> Unit ){

            itemView.titulo.text = meal.strMeal
            itemView.categoria.text = meal.strCategory

            var requestOptions = RequestOptions()
            requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(16))
            GlideApp.with(context)
                .load(meal.strMealThumb)
                .centerCrop()
                .into(itemView.img)

            if(meal.strYoutube!=""){
                itemView.youtube.setOnClickListener {
                    openYoutube(meal.strYoutube)
                }
            }else{
                itemView.youtube.setVisibility(View.GONE)
            }

            itemView.setOnClickListener{
                clickListener(meal)
            }
        }
    }

}