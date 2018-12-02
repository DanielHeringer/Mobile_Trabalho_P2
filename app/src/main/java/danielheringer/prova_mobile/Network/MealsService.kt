package danielheringer.prova_mobile.Network

import danielheringer.prova_mobile.Entidades.Meal
import danielheringer.prova_mobile.Entidades.MealsList
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Query

interface MealsService {

    companion object{
        private const val API_KEY = "1"
    }
    @GET("$API_KEY/latest.php")
    fun getSearch() : Call<MealsList>
}