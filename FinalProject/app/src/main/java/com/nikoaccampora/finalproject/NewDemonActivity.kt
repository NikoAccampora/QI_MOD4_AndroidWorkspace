package com.nikoaccampora.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.nikoaccampora.finalproject.databinding.ActivityNewDemonBinding
import com.nikoaccampora.finalproject.model.Demon
import com.nikoaccampora.finalproject.repository.DemonRepository
import com.google.android.material.snackbar.Snackbar

class NewDemonActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityNewDemonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewDemonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabSave.setOnClickListener {
            val repository = DemonRepository(applicationContext)
            val demonName = binding.edtName.text.toString()
            val demonHealth = binding.edtHealth.text.toString()
            val demonAttack = binding.edtAttack.text.toString()
            val demonAgility = binding.edtAgility.text.toString()

            val demon = Demon(
                nome = demonName,
                health = demonHealth,
                attack = demonAttack,
                agility = demonAgility
            )

            if(repository.insert(demon) != 0){
                Snackbar.make(it,R.string.label_msg_confirm,Snackbar.LENGTH_SHORT).show()
            }
    }

        supportActionBar?.setTitle(R.string.title_new_demon)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
}

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home)
            finish()
        return super.onOptionsItemSelected(item)
    }
}