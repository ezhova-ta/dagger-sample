package com.example.test.di.components

import com.example.test.di.modules.LocalStoreModule
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [LocalStoreModule::class, SubcomponentsModule::class])
interface AppComponent {
    // This function exposes the LoginComponent Factory out of the graph so consumers
    // can use it to obtain new instances of LoginComponent
    fun loginComponent(): LoginComponent.Factory
}

@Module(subcomponents = [LoginComponent::class])
class SubcomponentsModule