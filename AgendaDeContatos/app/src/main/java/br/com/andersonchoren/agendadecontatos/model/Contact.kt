package br.com.andersonchoren.agendadecontatos.model

import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

@DatabaseTable(tableName = "contacts")
data class Contact(
    @DatabaseField(generatedId = true)
    val id:Int=0,
    @DatabaseField
    val name:String="",
    @DatabaseField
    val phone:String=""
)
