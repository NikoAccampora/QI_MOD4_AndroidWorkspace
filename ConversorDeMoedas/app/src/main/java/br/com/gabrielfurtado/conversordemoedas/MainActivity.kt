package br.com.gabrielfurtado.conversordemoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import br.com.gabrielfurtado.conversordemoedas.databinding.ActivityMainBinding
import br.com.gabrielfurtado.conversordemoedas.model.IObserver
import br.com.gabrielfurtado.conversordemoedas.model.Price
import br.com.gabrielfurtado.conversordemoedas.repository.RateAPI

class MainActivity : AppCompatActivity(), IObserver {
    private lateinit var binding:ActivityMainBinding
    private val dollarValue = Price()
    private val euroValue = Price()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.lifecycleOwner = this
        binding.dollarValue = dollarValue
        binding.euroValue = euroValue

        binding.btnConvert.setOnClickListener{
            val rateAPI = RateAPI()
            rateAPI.getCurrency(applicationContext,this)
        }
    }

    override fun updateUI(data: MutableMap<String, Any>) {
        if(data.isNotEmpty()){
            val realValue = binding.edtReal.text.toString().toDouble()
            val dollarPrice = data["dollar"] as Double
            val euroPrice = data["euro"] as Double

            dollarValue.setValue(realValue / dollarPrice)
            euroValue.setValue(realValue / euroPrice)
        }
    }
}