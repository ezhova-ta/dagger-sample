package com.example.test.ui

import androidx.lifecycle.ViewModel
import com.example.test.data.UserRepository
import com.example.test.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class LoginViewModel @Inject constructor(
    userRepository: UserRepository
) : ViewModel() {
    init {
        userRepository.sayMeow()
    }
}