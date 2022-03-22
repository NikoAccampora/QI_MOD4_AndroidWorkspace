package com.nikoaccampora.finalproject.model
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

@DatabaseTable(tableName = "demons")
data class Demon(

    @DatabaseField(generatedId = true)
    val foto: Int=0,
    @DatabaseField
    val nome: String="",
    @DatabaseField
    val health: String="",
    @DatabaseField
    val attack: String="",
    @DatabaseField
    val agility: String=""

)