package com.example.test.di

import com.example.test.data.LoginRetrofitService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// @Module informs Dagger that this class is a Dagger Module
@Module
class NetworkModule {
    // @Provides tell Dagger how to create instances of the type that this function
    // returns (i.e. LoginRetrofitService).
    // Function parameters are the dependencies of this type.
    @Singleton
    @Provides
    fun provideLoginRetrofitService(): LoginRetrofitService {
        // Whenever Dagger needs to provide an instance of type LoginRetrofitService,
        // this code (the one inside the @Provides method) is run.
        return LoginRetrofitService()
    }
}