package com.binarybrains.movit.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Musuario")
data class User(
    @PrimaryKey(autoGenerate = true) val userId: Long = 0,
    @ColumnInfo(name = "nombre") val firstName: String?,
    @ColumnInfo(name = "appat") val appat: String?,
    @ColumnInfo(name = "apmat") val apmat: String?,
    @ColumnInfo(name = "correo") val email: String?,
    @ColumnInfo(name = "pss") val password: String?,
    @ColumnInfo(name = "ingreso") val income: Double?,
    @ColumnInfo(name = "curp") val curp: String?,
    @ColumnInfo(name = "edad") val age: Int?,
    @ColumnInfo(name = "genero") val gender: String?,
    @ColumnInfo(name = "ocupacion") val occupation: String?,
    @ColumnInfo(name = "direccion") val address: String?,
    @ColumnInfo(name = "ine") val ine: String?,
    @ColumnInfo(name = "telefono") val phone: String?,
    @ColumnInfo(name = "gastos") val bills: Double?,
    @ColumnInfo(name = "disponibilidad") val availability: String?,
    @ColumnInfo(name= "nivel_confianza") val confidenceLevel: Int =0
)
