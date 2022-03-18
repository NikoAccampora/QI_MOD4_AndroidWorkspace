package br.com.andersonchoren.agendadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.andersonchoren.agendadecontatos.databinding.ActivityNewContactBinding

class NewContactActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityNewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}