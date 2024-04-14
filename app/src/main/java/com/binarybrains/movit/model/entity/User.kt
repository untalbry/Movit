package com.binarybrains.movit.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

class User {
    @PrimaryKey(autoGenerate = true)
    val user_id: Long = 0
    @ColumnInfo(name = "first_name") val firstName: String = ""
    @ColumnInfo(name = "last_name") val lastName: String = ""
    @ColumnInfo(name = "email") val email: String = ""
    @ColumnInfo(name = "password")  val password : String = ""
    @ColumnInfo(name = "income") val incom : Double = 0.0
    @ColumnInfo(name = "curp") val curp : String = ""
    @ColumnInfo(name = "age") val age: Int = 0
    @ColumnInfo(name = "geneder") val gender : String = ""
    @ColumnInfo(name = "ocupation") val ocupation : String = ""
    @ColumnInfo(name = "address") val address :String = ""
    @ColumnInfo(name = "ine") val ine : String = ""
    @ColumnInfo(name = "phone") val phone : String = ""
    @ColumnInfo(name = "bills") val bills : Double = 0.0
    @ColumnInfo(name = "availability") val availability : String = ""

}