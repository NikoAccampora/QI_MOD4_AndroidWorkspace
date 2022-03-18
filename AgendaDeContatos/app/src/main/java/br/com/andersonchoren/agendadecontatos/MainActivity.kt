package br.com.andersonchoren.agendadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.andersonchoren.agendadecontatos.databinding.ActivityMainBinding
import br.com.andersonchoren.agendadecontatos.model.ContactAdapter
import br.com.andersonchoren.agendadecontatos.repository.ContactRepository

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        val repository = ContactRepository(applicationContext)
        val contacts = repository.findAll()
        binding.rvContacts.adapter = ContactAdapter(contacts)
        binding.rvContacts.layoutManager = LinearLayoutManager(applicationContext)
        binding.rvContacts.setHasFixedSize(true)
    }
}