package br.com.nikoaccampora.agendadecontatos

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.nikoaccampora.agendadecontatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}