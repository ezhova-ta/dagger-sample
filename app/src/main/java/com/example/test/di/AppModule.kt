package com.example.test.di

import android.content.Context
import com.example.test.data.LocalUserStorage
import com.example.test.data.LocalUserStorageImpl
import com.example.test.data.UserRepository
import com.example.test.data.UserRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val context: Context) {
    @Provides
    fun provideContext(): Context {
        return context
    }

    @Provides
    fun provideLocalUserStorage(context: Context): LocalUserStorage {
        return LocalUserStorageImpl(context)
    }

    @Provides
    fun provideUserRepository(storage: LocalUserStorage): UserRepository {
        return UserRepositoryImpl(storage)
    }
}