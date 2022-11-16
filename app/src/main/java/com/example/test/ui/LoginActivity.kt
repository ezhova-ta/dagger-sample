package com.example.test.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.test.App
import com.example.test.R
import com.example.test.SimplifiedLoginViewModel
import com.example.test.databinding.ActivityLoginBinding
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
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if(savedInstanceState == null) showFragment()
    }

    private fun showFragment() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<LoginUsernameFragment>(R.id.fragmentContainerView)
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.onScreenResumed()
    }
}