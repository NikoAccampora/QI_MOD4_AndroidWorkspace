package com.nikoaccampora.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nikoaccampora.finalproject.Adapter.AdapterDemon
import com.nikoaccampora.finalproject.databinding.ActivityMainBinding
import com.nikoaccampora.finalproject.model.Demon
import com.nikoaccampora.finalproject.repository.DemonRepository

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.fabNewDemon.setOnClickListener {
            val intent = Intent(applicationContext,NewDemonActivity::class.java)
            startActivity(intent)
        }

        supportActionBar?.setTitle(R.string.app_name)


        //////////////////////////
        //supportActionBar!!.hide()
        val recyclerView_demons = findViewById<RecyclerView>(R.id.recyclerView_demons)
        recyclerView_demons.layoutManager = LinearLayoutManager(this)
        recyclerView_demons.setHasFixedSize(true)
    }

    override fun onStart() {
        super.onStart()
        val repository = DemonRepository(applicationContext)
        val demons = repository.findAll()
        binding.recyclerViewDemons.adapter = AdapterDemon(applicationContext,demons)
    }
}