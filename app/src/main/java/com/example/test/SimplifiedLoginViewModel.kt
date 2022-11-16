package com.example.test

import com.example.test.data.ActivityScope
import com.example.test.data.UserRepository
import javax.inject.Inject

// A unique instance of SimplifiedLoginViewModel is provided in Components
// annotated with @ActivityScope
@ActivityScope
class SimplifiedLoginViewModel @Inject constructor(
    private val userRepository: UserRepository
) {
    fun onScreenResumed() {
        userRepository.sayMeow()
    }
}