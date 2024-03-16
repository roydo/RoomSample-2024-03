package com.example.roomsampleprev.data

class MyFriendsRepository(private val myFriendsDao: MyFriendsDao) {
    fun getAll() = myFriendsDao.getAll()

    suspend fun insertFriend(myFriends: MyFriends)
    = myFriendsDao.insertFriend(myFriends)

    suspend fun deleteAllMyFriends(allMyFriends: List<MyFriends>)
    = myFriendsDao.deleteAllMyFriends(allMyFriends)
}