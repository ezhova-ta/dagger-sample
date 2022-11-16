package com.example.test

import com.example.test.data.UserRepository
import timber.log.Timber
import javax.inject.Inject

// @Inject tells Dagger how to create instances of SimplifiedViewModel
class SimplifiedViewModel @Inject constructor(
    private val userRepository: UserRepository
) {
    fun onScreenResumed() {
        userRepository.sayMeow()
    }
}