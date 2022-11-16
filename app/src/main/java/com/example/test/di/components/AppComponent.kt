package com.example.test.di.components

import android.content.Context
import com.example.test.di.modules.LocalStoreModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [LocalStoreModule::class, SubcomponentsModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }

    // This function exposes the LoginComponent Factory out of the graph so consumers
    // can use it to obtain new instances of LoginComponent
    fun loginComponent(): LoginComponent.Factory
}

@Module(subcomponents = [LoginComponent::class])
class SubcomponentsModule