package br.com.andersonchoren.agendadecontatos.repository

import android.content.Context
import br.com.andersonchoren.agendadecontatos.dao.ContactDAO
import br.com.andersonchoren.agendadecontatos.dao.DataBaseHelper
import br.com.andersonchoren.agendadecontatos.model.Contact

class ContactRepository(context: Context) {
    private val dbHelper = DataBaseHelper(context)
    private val dao = ContactDAO(dbHelper.connectionSource)

    fun insert(contact: Contact):Int{
        val result = dao.create(contact)
        dao.connectionSource.close()
        return result
    }

    fun findAll() = dao.queryForAll()
}