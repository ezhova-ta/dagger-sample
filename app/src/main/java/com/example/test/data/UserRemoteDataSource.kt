package com.example.test.data

import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(
    private val loginRetrofitService: LoginRetrofitService
) {

}