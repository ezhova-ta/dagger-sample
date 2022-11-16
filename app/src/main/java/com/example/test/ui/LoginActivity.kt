package com.example.test.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test.App
import com.example.test.R
import com.example.test.SimplifiedLoginViewModel
import com.example.test.di.components.LoginComponent
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    lateinit var loginComponent: LoginComponent
    @Inject lateinit var viewModel: SimplifiedLoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        // LoginComponent is created in the activity's onCreate() method,
        // and it'll get implicitly destroyed when the activity gets destroyed
        loginComponent = (applicationContext as App)
            .appComponent
            .loginComponent()
            .create()

        // Make Dagger instantiate @Inject fields in LoginActivity
        loginComponent.inject(this)
        // Now viewModel is available

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onResume() {
        super.onResume()
        viewModel.onScreenResumed()
    }
}