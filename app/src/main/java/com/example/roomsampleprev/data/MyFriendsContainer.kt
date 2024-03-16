package com.example.roomsampleprev.data

import android.content.Context

class MyFriendsContainer(private val context: Context) {
    val myFriendsRepository: MyFriendsRepository by lazy {
        MyFriendsRepository(MyFriendsDatabase.getMyFriendsDatabase(context).myFriendsDao())
    }
}