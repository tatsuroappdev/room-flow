package com.tatsuro.app.roomandflow

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun loadAll(): Flow<List<User>>

    @Insert
    suspend fun insert(user: User)
}
