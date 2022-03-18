package br.com.andersonchoren.agendadecontatos.model

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.andersonchoren.agendadecontatos.R

class ContactAdapter(private val contacts:List<Contact>) : RecyclerView.Adapter<ContactHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_item,parent,false)
        return ContactHolder(view)
    }

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        holder.tvName.text = contacts[position].name
        holder.tvPhone.text = contacts[position].phone
    }

    override fun getItemCount(): Int = contacts.size

}

class ContactHolder(view: View) : RecyclerView.ViewHolder(view){
    val tvName: TextView = view.findViewById(R.id.tvName)
    val tvPhone: TextView = view.findViewById(R.id.tvPhone)
}