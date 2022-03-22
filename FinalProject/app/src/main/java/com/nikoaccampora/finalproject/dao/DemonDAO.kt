package com.nikoaccampora.finalproject.dao

import com.nikoaccampora.finalproject.model.Demon
import com.j256.ormlite.dao.BaseDaoImpl
import com.j256.ormlite.support.ConnectionSource

class DemonDAO(connectionSource: ConnectionSource?) : BaseDaoImpl<Demon,Int>(Demon::class.java) {
    init {
        setConnectionSource(connectionSource)
        initialize()
    }
}