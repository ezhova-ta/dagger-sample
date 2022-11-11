package com.example.test.di

import com.example.test.MainViewModel
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(mainViewModel: MainViewModel)
}