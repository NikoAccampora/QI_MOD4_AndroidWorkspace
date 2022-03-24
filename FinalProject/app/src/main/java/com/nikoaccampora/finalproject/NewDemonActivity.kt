package com.nikoaccampora.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.core.graphics.drawable.toDrawable
import com.nikoaccampora.finalproject.databinding.ActivityNewDemonBinding
import com.nikoaccampora.finalproject.model.Demon
import com.nikoaccampora.finalproject.repository.DemonRepository
import com.google.android.material.snackbar.Snackbar

class NewDemonActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewDemonBinding
    private lateinit var demon: Demon
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewDemonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //////////LISTA DE NOMES DAS FOTOS DE DEMONIOS
        val demonPictureNames = arrayOf(
            "Arachnotron",
            "Arch Vile",
            "Baron of Hell",
            "Cacodemon",
            "Cacolich",
            "Chaingun Demon",
            "Cyberdemon",
            "Dark Imp",
            "HellKnight",
            "Imp",
            "Lost Soul",
            "Mancubus",
            "Pain Elemental",
            "Pinky Demon",
            "Revenant",
            "Spider Mastermind"
        )

        demon = Demon()

        ////////////////////////BINDING SPINNER
        binding.spinner.adapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, demonPictureNames)
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            ///////MUDA FOTO NO SELECT TO SPINNER
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                demon.foto = selectPhoto(demonPictureNames[position])
                binding.imageSelectedPicture.setImageResource(selectPhoto(demonPictureNames[position]))
            }
        }


       ///////SALVA DADOS DIGITADOS NOS TEXTEDITS
        binding.fabSave.setOnClickListener {
            val repository = DemonRepository(applicationContext)
            demon.nome = binding.edtName.text.toString()
            demon.health = binding.edtHealth.text.toString()
            demon.attack = binding.edtAttack.text.toString()
            demon.agility = binding.edtAgility.text.toString()

            demon.health = demon.health.toInt().toString()
            demon.attack = demon.attack.toInt().toString()
            demon.agility = demon.agility.toInt().toString()

            if(demon.health.toInt()==0){
                demon.health = "1"
            }

            if(demon.attack.toInt()>10){
                demon.attack = "10"
            }

            if(demon.agility.toInt()>10){
                demon.agility = "10"
            }

            if (repository.insert(demon) != 0) {
                Snackbar.make(it, R.string.label_msg_confirm, Snackbar.LENGTH_SHORT).show()
            }
        }

        supportActionBar?.setTitle(R.string.title_new_demon)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }


    //////SELECIONAR FOTOS
    private fun selectPhoto(selected: String): Int {
        when(selected){
            "Arachnotron"-> return R.drawable.bspia1d1
            "Arch Vile"-> return R.drawable.vileb1e1
            "Baron of Hell"-> return R.drawable.bossa1
            "Cacodemon"-> return R.drawable.heada1
            "Cacolich"-> return R.drawable.cacolich
            "Chaingun Demon"-> return R.drawable.chaingundemon
            "Cyberdemon"-> return R.drawable.cybra1
            "Dark Imp"-> return R.drawable.darkimp
            "HellKnight"-> return R.drawable.bos2a1c1
            "Imp"-> return R.drawable.trooa1
            "Lost Soul"-> return R.drawable.skula1
            "Mancubus"-> return R.drawable.fattc1
            "Pain Elemental"-> return R.drawable.paina1
            "Pinky Demon"-> return R.drawable.sarga1
            "Revenant"-> return R.drawable.skelb1e1
            "Spider Mastermind"-> return R.drawable.spida1d1
            else -> return R.drawable.skula1

        }
    }


    //////VOLTAR PRA TELA ANTERIOR
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            finish()
        return super.onOptionsItemSelected(item)
    }

}