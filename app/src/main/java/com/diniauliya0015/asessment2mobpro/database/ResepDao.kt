package com.diniauliya0015.asessment2mobpro.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.diniauliya0015.asessment2mobpro.model.Resep
import kotlinx.coroutines.flow.Flow

@Dao
interface ResepDao {

    @Insert
    suspend fun insert(resep: Resep)

    @Update
    suspend fun update(resep: Resep)

    @Query("SELECT * FROM resep ORDER BY id DESC")
    fun getResep(): Flow<List<Resep>>
}
