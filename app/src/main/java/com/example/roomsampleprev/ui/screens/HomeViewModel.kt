package com.example.roomsampleprev.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomsampleprev.MyFriendsApplication
import com.example.roomsampleprev.data.MyFriend
import com.example.roomsampleprev.data.MyFriendsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class HomeViewModel (private val myFriendsRepository: MyFriendsRepository): ViewModel() {
    fun getAll(): Flow<List<MyFriend>>
    = myFriendsRepository.getAll()

    fun insertFriend(friendName: String)
    = viewModelScope.launch {
        myFriendsRepository.insertFriend(MyFriend(name = friendName))
    }

    fun deleteAllMyFriends(allMyFriends: List<MyFriend>)
    = viewModelScope.launch {
        myFriendsRepository.deleteAllMyFriends(allMyFriends)
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as MyFriendsApplication)
                HomeViewModel(application.container.myFriendsRepository)
            }
        }
    }
}