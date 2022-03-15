package br.com.gabrielfurtado.conversordemoedas.model

interface IObserver {
    fun updateUI(data:MutableMap<String,Any>)
}