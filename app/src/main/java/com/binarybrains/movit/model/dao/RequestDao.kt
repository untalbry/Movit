package com.binarybrains.movit.model.dao
import androidx.room.*
import com.binarybrains.movit.model.persistance.Request

@Dao
interface RequestDao {
    @Query("UPDATE Dsolicitud SET estado_solicitud = :newState WHERE requestId = :requestId")
    fun updateState(newState: Int, requestId: Int)
    // Insertar una nueva solicitud
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRequest(request: Request): Long

    // Leer solicitud por ID
    @Query("SELECT * FROM Dsolicitud WHERE requestId = :requestId")
    fun getRequestById(requestId: Long): Request?

    // Actualizar solicitud
    @Update
    fun updateRequest(request: Request)

    // Borrar solicitud
    @Delete
    fun deleteRequest(request: Request)

    // Leer todas las solicitudes
    @Query("SELECT * FROM Dsolicitud")
    fun getAllRequests(): List<Request>
}


