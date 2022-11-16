package com.example.test.data

import timber.log.Timber
import javax.inject.Inject

class UserLocalDataSource @Inject constructor(
    private val sharedPreferencesManager: SharedPreferencesManager
) {
    fun sayMeow() {
        sharedPreferencesManager.sayMeow()
    }
}