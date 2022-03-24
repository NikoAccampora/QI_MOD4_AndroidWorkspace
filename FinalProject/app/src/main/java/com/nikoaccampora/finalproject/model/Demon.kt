package com.nikoaccampora.finalproject.model
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

@DatabaseTable(tableName = "demons")
data class Demon(

    @DatabaseField(generatedId = true)
    var id: Int=0,
    @DatabaseField
    var foto: Int=0,
    @DatabaseField
    var nome: String="",
    @DatabaseField
    var health: String="",
    @DatabaseField
    var attack: String="",
    @DatabaseField
    var agility: String=""

)