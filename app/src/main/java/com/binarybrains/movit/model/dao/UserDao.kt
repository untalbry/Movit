import androidx.core.app.GrammaticalInflectionManagerCompat.GrammaticalGender
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.*
import com.binarybrains.movit.model.entity.User
import com.binarybrains.movit.model.persistance.userBasicInfo

@Dao
interface UserDao{
    @Query("Select * from Musuario")
    fun getAll():List<User>

    @Query("SELECT appat,apmat,correo from Musuario where correo= :email" )
    fun findUserByEmail(email: String):userBasicInfo?

    // Leer usuario por ID
    @Query("SELECT * FROM Musuario WHERE userId = :userId")
    fun getUserById(userId: Long): User?

    // Actualizar usuario
    @Update
    fun updateUser(user: User)

    // Borrar usuario
    @Delete
    fun deleteUser(user: User)


    @Insert(onConflict = OnConflictStrategy.REPLACE) // or choose another strategy like IGNORE
    fun insertUser(user: User)
}