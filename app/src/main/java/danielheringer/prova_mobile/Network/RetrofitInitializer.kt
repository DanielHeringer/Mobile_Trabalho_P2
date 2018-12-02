package danielheringer.prova_mobile.Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitInitializer {

    val retrofit = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun createMealsService() = retrofit.create(MealsService::class.java)

}