package com.example.roomsampleprev.data

class MyFriendsRepository(private val myFriendsDao: MyFriendsDao) {
    fun getAll() = myFriendsDao.getAll()

    suspend fun insertFriend(myFriend: MyFriend)
    = myFriendsDao.insertFriend(myFriend)

    suspend fun deleteAllMyFriends(allMyFriends: List<MyFriend>)
    = myFriendsDao.deleteAllMyFriends(allMyFriends)
}