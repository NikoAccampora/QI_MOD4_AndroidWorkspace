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
            "60",
            "2",
            "3"
        )
        listaDemons.add(demon1)
        val demon2 = Demon(
            R.drawable.sarga1,
            "Pinky Demon",
            "150",
            "3",
            "5"
        )
        listaDemons.add(demon2)
        val demon3 = Demon(
            R.drawable.heada1,
            "Cacodemon",
            "400",
            "4",
            "3"
        )
        listaDemons.add(demon3)
        val demon4 = Demon(
            R.drawable.paina1,
            "Pain Elemental",
            "400",
            "0",
            "3"
        )
        listaDemons.add(demon4)
        val demon5 = Demon(
            R.drawable.skula1,
            "Lost Soul",
            "100",
            "3",
            "5"
        )
        listaDemons.add(demon5)
        val demon6 = Demon(
            R.drawable.bos2a1c1,
            "HellKnight",
            "500",
            "5",
            "3"
        )
        listaDemons.add(demon6)
        val demon7 = Demon(
            R.drawable.bossa1,
            "Baron of Hell",
            "1000",
            "5",
            "3"
        )
        listaDemons.add(demon7)
        val demon8 = Demon(
            R.drawable.skelb1e1,
            "Revenant",
            "300",
            "6",
            "5"
        )
        listaDemons.add(demon8)
        val demon9 = Demon(
            R.drawable.fattc1,
            "Mancubus",
            "600",
            "7",
            "2"
        )
        listaDemons.add(demon9)
        val demon10 = Demon(
            R.drawable.bspia1d1,
            "Arachnotron",
            "500",
            "7",
            "3"
        )
        listaDemons.add(demon10)
        val demon11 = Demon(
            R.drawable.vileb1e1,
            "Arch Vile",
            "700",
            "6",
            "7"
        )
        listaDemons.add(demon11)
        val demon12 = Demon(
            R.drawable.spida1d1,
            "Spider Mastermind",
            "3000",
            "8",
            "5"
        )
        listaDemons.add(demon12)
        val demon13 = Demon(
            R.drawable.cybra1,
            "CyberDemon",
            "4000",
            "10",
            "6"
        )
        listaDemons.add(demon13)
    }
}