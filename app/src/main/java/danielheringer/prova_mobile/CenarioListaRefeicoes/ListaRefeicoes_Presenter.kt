package danielheringer.prova_mobile.CenarioListaRefeicoes

import danielheringer.prova_mobile.Entidades.Meal
import danielheringer.prova_mobile.Entidades.MealsList
import danielheringer.prova_mobile.Network.RetrofitInitializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListaRefeicoes_Presenter (val view : ListaRefeicoes_Contract.View) : ListaRefeicoes_Contract.Presenter {


    override fun onAtualizaLista(s :String, random : Boolean) {

        view.showProgressBar()
        val mealsService = RetrofitInitializer().createMealsService()

        val call : Call<MealsList>
        if(random)
            call = mealsService.getRandom()
        else
            call = mealsService.getSearch()


        call.enqueue(object : Callback<MealsList> {
            override fun onResponse(call: Call<MealsList>, response: Response<MealsList>) {
                view.hideProgressBar()
                if(response.body() != null){
                    view.exibeLista(response.body()!!.meals)
                    //view.showMsg(response.body()!!.meals.toString())
                }
                else{
                    view.showMsg("Nenhuma receita encontrada.")
                }
            }

            override fun onFailure(call: Call<MealsList>, t: Throwable) {
                view.hideProgressBar()
                view.showMsg ("Falha na conexão. Verifique sua rede."+t)
            }

        })
    }
}