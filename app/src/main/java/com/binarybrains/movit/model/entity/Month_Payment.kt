import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(tableName = "pago_mensualidad",
    foreignKeys = [ForeignKey(
        entity = Request:: class,
        parentColumns = arrayOf("id_solicitud"),
        childColumns = arrayOf("id_solicitud"),
        onDelete = ForeignKey.CASCADE),
        ])
data class Month_Payment(
    @PrimaryKey(autoGenerate = true) val paymentId: Long = 0,
    @ColumnInfo(name = "id_solicitud") val requester: Int,//quite ? porque es atributo fk
    @ColumnInfo(name = "monto_pagado") val lender: Double?,
    @ColumnInfo(name = "fecha_pago") val interestRate: String?
)