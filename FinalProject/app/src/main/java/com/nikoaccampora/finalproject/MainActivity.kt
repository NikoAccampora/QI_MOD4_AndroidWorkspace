package com.nikoaccampora.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nikoaccampora.finalproject.Adapter.AdapterDemon
import com.nikoaccampora.finalproject.model.Demon

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //supportActionBar!!.hide()
        val recyclerView_demons = findViewById<RecyclerView>(R.id.recyclerView_demons)
        recyclerView_demons.layoutManager = LinearLayoutManager(this)
        recyclerView_demons.setHasFixedSize(true)
        //Adapter Config
        val listaDemons: MutableList<Demon> = mutableListOf()
        val adapterDemon = AdapterDemon(this,listaDemons)
        recyclerView_demons.adapter = adapterDemon

        val demon1 = Demon(
            R.drawable.trooa1,
        "Imp",
            "Health: 60",
            "Attack: 2/10",
            "Agility: 3/10"
        )
        listaDemons.add(demon1)
    }
}