package com.example.test.di.modules

import com.example.test.di.components.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
class SubcomponentsModule