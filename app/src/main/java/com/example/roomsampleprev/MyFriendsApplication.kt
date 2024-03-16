package com.example.roomsampleprev

import android.app.Application
import com.example.roomsampleprev.data.MyFriendsContainer

class MyFriendsApplication: Application() {
    lateinit var container: MyFriendsContainer
    override fun onCreate() {
        super.onCreate()
        container = MyFriendsContainer(this)
    }
}