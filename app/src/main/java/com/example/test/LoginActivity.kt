package com.example.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    @Inject lateinit var viewModel: SimplifiedLoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        // Make Dagger instantiate @Inject fields in LoginActivity
        (applicationContext as App).appComponent.inject(this)
        // Now viewModel is available
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onResume() {
        super.onResume()
        viewModel.onScreenResumed()
    }
}