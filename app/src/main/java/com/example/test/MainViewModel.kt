package com.example.test

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.test.data.UserRepository
import javax.inject.Inject

class MainViewModel : ViewModel() {
    @Inject
    lateinit var userRepository: UserRepository

    fun onResumed() {
        userRepository.sayMeow()
    }
}