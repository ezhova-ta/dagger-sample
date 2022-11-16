package com.example.test.ui

import androidx.lifecycle.ViewModel
import com.example.test.data.UserRepository
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    userRepository: UserRepository
) : ViewModel() {
    init {
        userRepository.sayMeow()
    }
}