package br.com.andersonchoren.agendadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.andersonchoren.agendadecontatos.databinding.ActivityNewContactBinding
import br.com.andersonchoren.agendadecontatos.model.Contact
import br.com.andersonchoren.agendadecontatos.repository.ContactRepository
import com.google.android.material.snackbar.Snackbar

class NewContactActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fabSave.setOnClickListener {
            val repository = ContactRepository(applicationContext)
            val contactName = binding.edtName.text.toString()
            val contactPhone = binding.edtPhone.text.toString()

            val contact = Contact(
                name = contactName,
                phone = contactPhone
            )

            if(repository.insert(contact) != 0){
                Snackbar.make(it,R.string.label_msg_confirm,Snackbar.LENGTH_SHORT).show()
            }
        }

        supportActionBar?.setTitle(R.string.title_new_contact)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home)
            finish()
        return super.onOptionsItemSelected(item)
    }
}