package com.example.test.data

import javax.inject.Inject
import javax.inject.Singleton

// if you hadn't had scoped UserRepository to ApplicationComponent, Dagger would
// automatically have included UserRepository and its dependencies as part of
// LoginComponent because that is currently the only place UserRepository is used
@Singleton
class UserRepository @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource
) {
    fun sayMeow() {
        userLocalDataSource.sayMeow()
    }
}