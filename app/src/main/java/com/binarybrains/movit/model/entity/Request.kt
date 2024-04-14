import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import com.binarybrains.movit.model.entity.User

@Entity(tableName = "Dsolicitud",
    foreignKeys = [ForeignKey(
        entity = User:: class,
        parentColumns = arrayOf("userId"),
        childColumns = arrayOf("id_solicitante"),
        onDelete = ForeignKey.CASCADE),
        ForeignKey(
            entity = User:: class,
            parentColumns = arrayOf("userId"),
            childColumns = arrayOf("id_prestamista"),
            onDelete = ForeignKey.CASCADE

        )])
data class Request(
    @PrimaryKey(autoGenerate = true) val requestId: Long = 0,
    @ColumnInfo(name = "id_solicitante") val requester: Int, //quite ? porque es atributo fk
    @ColumnInfo(name = "id_prestamista") val lender: Int,  //quite ? porque es atributo fk
    @ColumnInfo(name = "tasa_interes") val interestRate: Double=15.0, //default establecido
    @ColumnInfo(name = "estado_solicitud") val requestState: Int=0
)