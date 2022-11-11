package com.example.test.data

import android.util.Log

class UserRepositoryImpl(storage: LocalUserStorage) : UserRepository {
    override fun sayMeow() {
        Log.d("test_dagger", "meow")
    }
}