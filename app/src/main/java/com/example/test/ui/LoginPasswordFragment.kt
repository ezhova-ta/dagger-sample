package com.example.test.ui

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.test.SimplifiedLoginViewModel
import javax.inject.Inject

class LoginPasswordFragment : Fragment() {
    @Inject lateinit var viewModel: SimplifiedLoginViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity as LoginActivity).loginComponent.inject(this)
    }
}