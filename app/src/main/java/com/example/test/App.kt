package com.example.test

import android.app.Application
import com.example.test.di.components.AppComponent
import com.example.test.di.components.DaggerAppComponent
import timber.log.Timber

// appComponent lives in the Application class to share its lifecycle
class App : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        // Reference to the application graph that is used across the whole app
        appComponent = DaggerAppComponent
            .factory()
            .create(this)
        Timber.plant(Timber.DebugTree())
    }
}