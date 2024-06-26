import androidx.room.Dao
import androidx.room.Query
import androidx.room.Insert
import androidx.room.*
import com.binarybrains.movit.model.persistance.User
import com.binarybrains.movit.model.entity.userBasicInfo

@Dao
interface UserDao{
    @Query("Select * from Musuario")
    fun getAll():List<User>

    @Query("SELECT appat,apmat,correo from Musuario where correo= :email" )
    fun findUserByEmail(email: String): userBasicInfo?

    // Leer usuario por ID
    @Query("SELECT * FROM Musuario WHERE userId = :userId")
    fun getUserById(userId: Long): User?

    // Actualizar usuario
    @Update
    fun updateUser(user: User)

    // Borrar usuario
    @Delete
    fun deleteUser(user: User)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)
    @Query("UPDATE musuario SET disponibilidad = :newState WHERE userId = :userId")
    fun updateAvailability(newState: Int, userId: Int)

}