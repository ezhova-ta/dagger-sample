package com.example.test.di

import com.example.test.ui.LoginActivity
import com.example.test.data.ActivityScope
import com.example.test.ui.LoginPasswordFragment
import com.example.test.ui.LoginUsernameFragment
import dagger.Subcomponent

// The LoginComponent must always provide the same instance of LoginViewModel
// each time it's requested. You can ensure this by creating a custom annotation scope
// and annotating both LoginComponent and LoginViewModel with it

// Classes annotated with @ActivityScope are scoped to the graph and the same
// instance of that type is provided every time the type is requested.
@ActivityScope
@Subcomponent
interface LoginComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(loginActivity: LoginActivity)

    // Now, if you had two fragments that need LoginViewModel,
    // both of them are provided with the same instance
    fun inject(loginUsernameFragment: LoginUsernameFragment)
    fun inject(loginPasswordFragment: LoginPasswordFragment)
}