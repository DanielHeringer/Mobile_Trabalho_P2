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
                var texto_ingrediente : TextView = findViewById(idsIngredient[0]) as TextView
                texto_ingrediente.text = refeicao.strIngredient1
                var texto_medida : TextView = findViewById(idsMeasure[0]) as TextView
                var medida = "("+refeicao.strMeasure1+")"
                texto_medida.text = medida
                ingredient_1.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient2 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[1]) as TextView
                texto_ingrediente.text = refeicao.strIngredient2
                var texto_medida : TextView = findViewById(idsMeasure[1]) as TextView
                var medida = "("+refeicao.strMeasure2+")"
                texto_medida.text = medida
                ingredient_2.setVisibility(View.VISIBLE)
           }
            if(refeicao.strIngredient3 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[2]) as TextView
                texto_ingrediente.text = refeicao.strIngredient3
                var texto_medida : TextView = findViewById(idsMeasure[2]) as TextView
                var medida = "("+refeicao.strMeasure3+")"
                texto_medida.text = medida
                ingredient_3.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient4 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[3]) as TextView
                texto_ingrediente.text = refeicao.strIngredient4
                var texto_medida : TextView = findViewById(idsMeasure[3]) as TextView
                var medida = "("+refeicao.strMeasure4+")"
                texto_medida.text = medida
                ingredient_4.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient5 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[4]) as TextView
                texto_ingrediente.text = refeicao.strIngredient5
                var texto_medida : TextView = findViewById(idsMeasure[4]) as TextView
                var medida = "("+refeicao.strMeasure5+")"
                texto_medida.text = medida
                ingredient_5.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient6 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[5]) as TextView
                texto_ingrediente.text = refeicao.strIngredient6
                var texto_medida : TextView = findViewById(idsMeasure[5]) as TextView
                var medida = "("+refeicao.strMeasure6+")"
                texto_medida.text = medida
                ingredient_6.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient7 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[6]) as TextView
                texto_ingrediente.text = refeicao.strIngredient7
                var texto_medida : TextView = findViewById(idsMeasure[6]) as TextView
                var medida = "("+refeicao.strMeasure7+")"
                texto_medida.text = medida
                ingredient_7.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient8 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[7]) as TextView
                texto_ingrediente.text = refeicao.strIngredient8
                var texto_medida : TextView = findViewById(idsMeasure[7]) as TextView
                var medida = "("+refeicao.strMeasure8+")"
                texto_medida.text = medida
                ingredient_8.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient9 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[8]) as TextView
                texto_ingrediente.text = refeicao.strIngredient9
                var texto_medida : TextView = findViewById(idsMeasure[8]) as TextView
                var medida = "("+refeicao.strMeasure9+")"
                texto_medida.text = medida
                ingredient_9.setVisibility(View.VISIBLE)
            }

            if(refeicao.strIngredient10 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[9]) as TextView
                texto_ingrediente.text = refeicao.strIngredient10
                var texto_medida : TextView = findViewById(idsMeasure[9]) as TextView
                var medida = "("+refeicao.strMeasure10+")"
                texto_medida.text = medida
                ingredient_10.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient11 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[10]) as TextView
                texto_ingrediente.text = refeicao.strIngredient11
                var texto_medida : TextView = findViewById(idsMeasure[10]) as TextView
                var medida = "("+refeicao.strMeasure11+")"
                texto_medida.text = medida
                ingredient_11.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient12 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[11]) as TextView
                texto_ingrediente.text = refeicao.strIngredient12
                var texto_medida : TextView = findViewById(idsMeasure[11]) as TextView
                var medida = "("+refeicao.strMeasure12+")"
                texto_medida.text = medida
                ingredient_12.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient13 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[12]) as TextView
                texto_ingrediente.text = refeicao.strIngredient13
                var texto_medida : TextView = findViewById(idsMeasure[12]) as TextView
                var medida = "("+refeicao.strMeasure13+")"
                texto_medida.text = medida
                ingredient_13.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient14 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[13]) as TextView
                texto_ingrediente.text = refeicao.strIngredient14
                var texto_medida : TextView = findViewById(idsMeasure[13]) as TextView
                var medida = "("+refeicao.strMeasure14+")"
                texto_medida.text = medida
                ingredient_14.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient15 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[14]) as TextView
                texto_ingrediente.text = refeicao.strIngredient15
                var texto_medida : TextView = findViewById(idsMeasure[14]) as TextView
                var medida = "("+refeicao.strMeasure15+")"
                texto_medida.text = medida
                ingredient_15.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient16 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[15]) as TextView
                texto_ingrediente.text = refeicao.strIngredient16
                var texto_medida : TextView = findViewById(idsMeasure[15]) as TextView
                var medida = "("+refeicao.strMeasure16+")"
                texto_medida.text = medida
                ingredient_16.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient17 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[16]) as TextView
                texto_ingrediente.text = refeicao.strIngredient17
                var texto_medida : TextView = findViewById(idsMeasure[16]) as TextView
                var medida = "("+refeicao.strMeasure17+")"
                texto_medida.text = medida
                ingredient_17.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient18 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[17]) as TextView
                texto_ingrediente.text = refeicao.strIngredient18
                var texto_medida : TextView = findViewById(idsMeasure[17]) as TextView
                var medida = "("+refeicao.strMeasure18+")"
                texto_medida.text = medida
                ingredient_18.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient19 != ""){
                var texto_ingrediente : TextView = findViewById(idsIngredient[18]) as TextView
                texto_ingrediente.text = refeicao.strIngredient19
                var texto_medida : TextView = findViewById(idsMeasure[18]) as TextView
                var medida = "("+refeicao.strMeasure19+")"
                texto_medida.text = medida
                ingredient_19.setVisibility(View.VISIBLE)
            }
            if(refeicao.strIngredient20 != ""){Toast.makeText(this, refeicao.strIngredient20, Toast.LENGTH_SHORT).show()
                var texto_ingrediente : TextView = findViewById(idsIngredient[19]) as TextView
                texto_ingrediente.text = refeicao.strIngredient20
                var texto_medida : TextView = findViewById(idsMeasure[19]) as TextView
                var medida = "("+refeicao.strMeasure20+")"
                texto_medida.text = medida
                ingredient_20.setVisibility(View.VISIBLE)
            }

            instructions_text.text = refeicao.strInstructions
        }


    }

}
