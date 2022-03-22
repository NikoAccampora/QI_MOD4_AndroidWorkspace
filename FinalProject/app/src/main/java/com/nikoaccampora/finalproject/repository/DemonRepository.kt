package com.nikoaccampora.finalproject.repository

import android.content.Context
import com.nikoaccampora.finalproject.dao.DemonDAO
import com.nikoaccampora.finalproject.dao.DataBaseHelper
import com.nikoaccampora.finalproject.model.Demon

class ContactRepository(context: Context) {
    private val dbHelper = DataBaseHelper(context)
    private val dao = DemonDAO(dbHelper.connectionSource)

    fun insert(demon:Demon):Int{
        val result = dao.create(demon)
        dao.connectionSource.close()
        return result
    }

    fun findAll() = dao.queryForAll()
}
