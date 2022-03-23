package com.nikoaccampora.finalproject.Adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nikoaccampora.finalproject.R
import com.nikoaccampora.finalproject.model.Demon

class AdapterDemon(private val context: Context, private  val demons: MutableList<Demon>): RecyclerView.Adapter<AdapterDemon.DemonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemonViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.demon_item,parent,false)
        val holder = DemonViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: DemonViewHolder, position: Int) {
        holder.foto.setImageResource(demons[position].foto)
        Log.d("appdebug","Nome: ${demons[position]}")
        holder.nome.text = demons[position].nome
        holder.health.text = demons[position].health
        holder.attack.text = demons[position].attack
        holder.agility.text = demons[position].agility
    }

    override fun getItemCount(): Int = demons.size


    inner class DemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.demon_image)
        val nome = itemView.findViewById<TextView>(R.id.demon_name)
        val health = itemView.findViewById<TextView>(R.id.demon_health_value)
        val attack = itemView.findViewById<TextView>(R.id.demon_attack_value)
        val agility = itemView.findViewById<TextView>(R.id.demon_agility_value)
    }
}