import androidx.room.ColumnInfo
import androidx.room.Entity
//import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import com.binarybrains.movit.model.persistance.User

@Entity(tableName = "referente_referido", primaryKeys = ["id_referente","id_referido"],
    foreignKeys = [ForeignKey(
        entity = User:: class,
        parentColumns = arrayOf("userId"),
        childColumns = arrayOf("id_referente"),
        onDelete = ForeignKey.CASCADE),
        ForeignKey(
            entity = User:: class,
            parentColumns = arrayOf("userId"),
            childColumns = arrayOf("id_referente"),
            onDelete = ForeignKey.CASCADE

        )])
data class Refered_referenced(
    @ColumnInfo(name = "id_referente") val referrer: Int,//quite ? porque es atributo fk
    @ColumnInfo(name = "id_referido") val referenced: Int//quite ? porque es atributo fk
)