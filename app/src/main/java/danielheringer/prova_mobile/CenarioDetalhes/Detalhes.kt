package danielheringer.prova_mobile.CenarioDetalhes

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.TextView
import android.widget.Toast
import danielheringer.prova_mobile.Entidades.Meal
import danielheringer.prova_mobile.GlideApp
import danielheringer.prova_mobile.R

import kotlinx.android.synthetic.main.activity_detalhes.*

class Detalhes : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        val refeicao : Meal? = intent.getSerializableExtra("refeicao") as Meal
        if(refeicao!=null){
            GlideApp.with(this)
                .load(refeicao.strMealThumb)
                .centerCrop()
                .into(imageView)
            getSupportActionBar()!!.setTitle(refeicao.strMeal+" - "+refeicao.strCategory)

            val idsIngredient : IntArray =  intArrayOf(R.id.ingredient_text_1, R.id.ingredient_text_2, R.id.ingredient_text_3, R.id.ingredient_text_4,
                R.id.ingredient_text_5, R.id.ingredient_text_6,R.id.ingredient_text_7, R.id.ingredient_text_8, R.id.ingredient_text_9,
                R.id.ingredient_text_10, R.id.ingredient_text_11, R.id.ingredient_text_12, R.id.ingredient_text_13, R.id.ingredient_text_14, R.id.ingredient_text_15,
                R.id.ingredient_text_16, R.id.ingredient_text_17, R.id.ingredient_text_18, R.id.ingredient_text_19, R.id.ingredient_text_20)

            val idsMeasure : IntArray =  intArrayOf(R.id.measure_text_1, R.id.measure_text_2, R.id.measure_text_3, R.id.measure_text_4,
                R.id.measure_text_5, R.id.measure_text_6,R.id.measure_text_7, R.id.measure_text_8, R.id.measure_text_9,
                R.id.measure_text_10, R.id.measure_text_11, R.id.measure_text_12, R.id.measure_text_13, R.id.measure_text_14, R.id.measure_text_15,
                R.id.measure_text_16, R.id.measure_text_17, R.id.measure_text_18, R.id.measure_text_19, R.id.measure_text_20)


            if(refeicao.strIngredient1 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient1+"-Small.png").into(imgIng1)

                var texto_ingrediente : TextView = findViewById(idsIngredient[0]) as TextView
                texto_ingrediente.text = refeicao.strIngredient1

                if(refeicao.strMeasure1 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[0]) as TextView
                    var medida ="(" + refeicao.strMeasure1 + ")"
                    texto_medida.text = medida
                }
                ingredient_1.setVisibility(View.VISIBLE)
            }

            if(refeicao.strIngredient2 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient2+"-Small.png").into(imgIng2)

                var texto_ingrediente : TextView = findViewById(idsIngredient[1]) as TextView
                texto_ingrediente.text = refeicao.strIngredient2

                if(refeicao.strMeasure2 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[1]) as TextView
                    var medida ="(" + refeicao.strMeasure2 + ")"
                    texto_medida.text = medida
                }
                ingredient_2.setVisibility(View.VISIBLE)
           }

            if(refeicao.strIngredient3 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient3+"-Small.png").into(imgIng3)

                var texto_ingrediente : TextView = findViewById(idsIngredient[2]) as TextView
                texto_ingrediente.text = refeicao.strIngredient3

                if(refeicao.strMeasure3 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[2]) as TextView
                    var medida = "(" + refeicao.strMeasure3 + ")"
                    texto_medida.text = medida
                }
                ingredient_3.setVisibility(View.VISIBLE)
            }

            if(refeicao.strIngredient4 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient4+"-Small.png").into(imgIng4)

                var texto_ingrediente : TextView = findViewById(idsIngredient[3]) as TextView
                texto_ingrediente.text = refeicao.strIngredient4

                if(refeicao.strMeasure4 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[3]) as TextView
                    var medida = "(" + refeicao.strMeasure4 + ")"
                    texto_medida.text = medida
                }
                ingredient_4.setVisibility(View.VISIBLE)
            }

            if(refeicao.strIngredient5 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient5+"-Small.png").into(imgIng5)

                var texto_ingrediente : TextView = findViewById(idsIngredient[4]) as TextView
                texto_ingrediente.text = refeicao.strIngredient5

                if(refeicao.strMeasure5 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[4]) as TextView
                    var medida = "(" + refeicao.strMeasure5 + ")"
                    texto_medida.text = medida
                }
                ingredient_5.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient6 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient6+"-Small.png").into(imgIng6)
                var texto_ingrediente : TextView = findViewById(idsIngredient[5]) as TextView
                texto_ingrediente.text = refeicao.strIngredient6

                if(refeicao.strMeasure6 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[5]) as TextView
                    var medida = "(" + refeicao.strMeasure6 + ")"
                    texto_medida.text = medida
                }
                ingredient_6.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient7 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient7+"-Small.png").into(imgIng7)
                var texto_ingrediente : TextView = findViewById(idsIngredient[6]) as TextView
                texto_ingrediente.text = refeicao.strIngredient7

                if(refeicao.strMeasure7 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[6]) as TextView
                    var medida = "(" + refeicao.strMeasure7 + ")"
                    texto_medida.text = medida
                }
                ingredient_7.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient8 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient8+"-Small.png").into(imgIng8)
                var texto_ingrediente : TextView = findViewById(idsIngredient[7]) as TextView
                texto_ingrediente.text = refeicao.strIngredient8

                if(refeicao.strMeasure8 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[7]) as TextView
                    var medida = "(" + refeicao.strMeasure8 + ")"
                    texto_medida.text = medida
                }
                ingredient_8.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient9 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient9+"-Small.png").into(imgIng9)
                var texto_ingrediente : TextView = findViewById(idsIngredient[8]) as TextView
                texto_ingrediente.text = refeicao.strIngredient9

                if(refeicao.strMeasure9 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[8]) as TextView
                    var medida = "(" + refeicao.strMeasure9 + ")"
                    texto_medida.text = medida
                }
                ingredient_9.setVisibility(View.VISIBLE)
            }

            if(refeicao.strIngredient10 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient10+"-Small.png").into(imgIng10)
                var texto_ingrediente : TextView = findViewById(idsIngredient[9]) as TextView
                texto_ingrediente.text = refeicao.strIngredient10

                if(refeicao.strMeasure10 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[9]) as TextView
                    var medida = "(" + refeicao.strMeasure10 + ")"
                    texto_medida.text = medida
                }
                ingredient_10.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient11 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient11+"-Small.png").into(imgIng11)
                var texto_ingrediente : TextView = findViewById(idsIngredient[10]) as TextView
                texto_ingrediente.text = refeicao.strIngredient11

                if(refeicao.strMeasure11 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[10]) as TextView
                    var medida = "(" + refeicao.strMeasure11 + ")"
                    texto_medida.text = medida
                }
                ingredient_11.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient12 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient12+"-Small.png").into(imgIng12)
                var texto_ingrediente : TextView = findViewById(idsIngredient[11]) as TextView
                texto_ingrediente.text = refeicao.strIngredient12

                if(refeicao.strMeasure12 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[11]) as TextView
                    var medida = "(" + refeicao.strMeasure12 + ")"
                    texto_medida.text = medida
                }
                ingredient_12.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient13 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient13+"-Small.png").into(imgIng13)
                var texto_ingrediente : TextView = findViewById(idsIngredient[12]) as TextView
                texto_ingrediente.text = refeicao.strIngredient13

                if(refeicao.strMeasure13 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[12]) as TextView
                    var medida = "(" + refeicao.strMeasure13 + ")"
                    texto_medida.text = medida
                }
                ingredient_13.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient14 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient14+"-Small.png").into(imgIng14)
                var texto_ingrediente : TextView = findViewById(idsIngredient[13]) as TextView
                texto_ingrediente.text = refeicao.strIngredient14

                if(refeicao.strMeasure14 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[13]) as TextView
                    var medida = "(" + refeicao.strMeasure14 + ")"
                    texto_medida.text = medida
                }
                ingredient_14.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient15 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient15+"-Small.png").into(imgIng15)
                var texto_ingrediente : TextView = findViewById(idsIngredient[14]) as TextView
                texto_ingrediente.text = refeicao.strIngredient15

                if(refeicao.strMeasure15 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[14]) as TextView
                    var medida = "(" + refeicao.strMeasure15 + ")"
                    texto_medida.text = medida
                }
                ingredient_15.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient16 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient16+"-Small.png").into(imgIng16)
                var texto_ingrediente : TextView = findViewById(idsIngredient[15]) as TextView
                texto_ingrediente.text = refeicao.strIngredient16

                if(refeicao.strMeasure16 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[15]) as TextView
                    var medida = "(" + refeicao.strMeasure16 + ")"
                    texto_medida.text = medida
                }
                ingredient_16.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient17 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient17+"-Small.png").into(imgIng17)
                var texto_ingrediente : TextView = findViewById(idsIngredient[16]) as TextView
                texto_ingrediente.text = refeicao.strIngredient17

                if(refeicao.strMeasure17 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[16]) as TextView
                    var medida = "(" + refeicao.strMeasure17 + ")"
                    texto_medida.text = medida
                }
                ingredient_17.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient18 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient18+"-Small.png").into(imgIng18)
                var texto_ingrediente : TextView = findViewById(idsIngredient[17]) as TextView
                texto_ingrediente.text = refeicao.strIngredient18

                if(refeicao.strMeasure18 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[17]) as TextView
                    var medida = "(" + refeicao.strMeasure18 + ")"
                    texto_medida.text = medida
                }
                ingredient_18.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient19 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient19+"-Small.png").into(imgIng19)
                var texto_ingrediente : TextView = findViewById(idsIngredient[18]) as TextView
                texto_ingrediente.text = refeicao.strIngredient19

                if(refeicao.strMeasure19 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[18]) as TextView
                    var medida = "(" + refeicao.strMeasure19 + ")"
                    texto_medida.text = medida
                }
                ingredient_19.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient20 != ""){
                GlideApp.with(this).load("https://www.themealdb.com/images/ingredients/"+refeicao.strIngredient20+"-Small.png").into(imgIng20)
                var texto_ingrediente : TextView = findViewById(idsIngredient[19]) as TextView
                texto_ingrediente.text = refeicao.strIngredient20
                if(refeicao.strMeasure20 != "") {
                    var texto_medida: TextView = findViewById(idsMeasure[19]) as TextView
                    var medida = "(" + refeicao.strMeasure20 + ")"
                    texto_medida.text = medida
                }
                ingredient_20.setVisibility(View.VISIBLE)
            }

            instructions_text.text = refeicao.strInstructions

           // allIng.getBackground().setAlpha(41)
            from.text = refeicao.strArea
        }


    }

}
