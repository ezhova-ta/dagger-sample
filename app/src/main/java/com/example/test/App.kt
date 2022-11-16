package com.example.test

import android.app.Application
import com.example.test.di.AppComponent
import com.example.test.di.DaggerAppComponent
import timber.log.Timber

// appComponent lives in the Application class to share its lifecycle
class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        // Reference to the application graph that is used across the whole app
        appComponent = DaggerAppComponent.create()
        Timber.plant(Timber.DebugTree())
    }
}