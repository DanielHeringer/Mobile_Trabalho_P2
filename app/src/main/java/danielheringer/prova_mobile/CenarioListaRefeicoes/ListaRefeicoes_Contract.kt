package danielheringer.prova_mobile.CenarioListaRefeicoes

import danielheringer.prova_mobile.Entidades.Meal

interface ListaRefeicoes_Contract {
    interface View{
        fun exibeLista(lista: List<Meal>)
        fun showMsg(s: String)
        fun hideProgressBar()
        fun showProgressBar()
        fun openYoutubeLink(youtubeURL: String)
        fun random()
    }

    interface Presenter{
        fun onAtualizaLista(s: String, random : Boolean)
    }
}