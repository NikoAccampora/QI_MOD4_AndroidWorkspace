package br.com.andersonchoren.agendadecontatos.dao

import br.com.andersonchoren.agendadecontatos.model.Contact
import com.j256.ormlite.dao.BaseDaoImpl
import com.j256.ormlite.support.ConnectionSource

class ContactDAO(connectionSource: ConnectionSource?) : BaseDaoImpl<Contact,Int>(Contact::class.java) {
    init {
       setConnectionSource(connectionSource)
        initialize()
    }
}