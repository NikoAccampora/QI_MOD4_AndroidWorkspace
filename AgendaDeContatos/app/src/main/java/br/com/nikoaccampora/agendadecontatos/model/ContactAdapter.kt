package br.com.nikoaccampora.agendadecontatos.model

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.nikoaccampora.agendadecontatos.R

class ContactAdapter : RecyclerView.Adapter<ContactHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}

class ContactHolder(view: View) : RecyclerView.ViewHolder(view){
    val tvName:TextView = view.findViewById(R.id.tvName)
    val tvPhone: TextView = view.findViewById(R.id.tvPhone)
}