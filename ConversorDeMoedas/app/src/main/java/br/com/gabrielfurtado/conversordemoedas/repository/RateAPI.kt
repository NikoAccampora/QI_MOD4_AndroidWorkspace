package br.com.gabrielfurtado.conversordemoedas.repository

import android.content.Context
import android.content.SyncStatusObserver
import android.util.Log
import br.com.gabrielfurtado.conversordemoedas.model.IObserver
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class RateAPI {
    fun getCurrency(
        context: Context,
        observer: IObserver
    ){
        val url = "https://api.hgbrasil.com/finance?key=855d498a"
        val queue = Volley.newRequestQueue(context)
        val stringReq = StringRequest(
            Request.Method.GET,
            url,
            {
                // Sucesso!!!
                result ->
                val jsonObject = JSONObject(result)
                val results = jsonObject.getJSONObject("results")
                val currencies = results.getJSONObject("currencies")
                val dollarValue = currencies.getJSONObject("USD").getDouble("buy")
                val euroValue = currencies.getJSONObject("EUR").getDouble("buy")

                val map = mutableMapOf<String,Any>()
                map["dollar"] = dollarValue
                map["euro"] = euroValue

                observer.updateUI(map)
            },
            {
                // Erro!!!
                Log.d("APPDEBUG","Erro!!!")
            }
        )
        queue.add(stringReq)
    }
}