package com.example.roomsampleprev.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MyFriendsDao {
    @Query("SELECT * FROM sample")
    fun getAll(): Flow<List<MyFriends>>

    @Insert
    suspend fun insertFriend(myFriends: MyFriends)

    @Delete
    suspend fun deleteAllMyFriends(allMyFriends: List<MyFriends>)
}