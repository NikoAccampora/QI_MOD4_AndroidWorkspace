package com.nikoaccampora.finalproject.dao

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.nikoaccampora.finalproject.model.Demon
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
import com.j256.ormlite.support.ConnectionSource
import com.j256.ormlite.table.TableUtils

class DataBaseHelper(context: Context) : OrmLiteSqliteOpenHelper(context,db,null,version) {
    companion object{
        private const val db = "demons.db"
        private const val version = 1
    }

    override fun onCreate(database: SQLiteDatabase?, connectionSource: ConnectionSource?) {
        TableUtils.createTable(connectionSource,Demon::class.java)
    }

    override fun onUpgrade(
        database: SQLiteDatabase?,
        connectionSource: ConnectionSource?,
        oldVersion: Int,
        newVersion: Int
    ) {}
}