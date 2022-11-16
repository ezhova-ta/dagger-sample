package com.example.test

import com.example.test.data.UserRepository
import javax.inject.Inject

// @Inject tells Dagger how to create instances of SimplifiedViewModel
class SimplifiedLoginViewModel @Inject constructor(
    private val userRepository: UserRepository
) {
    fun onScreenResumed() {
        userRepository.sayMeow()
    }
}