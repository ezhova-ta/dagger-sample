package com.example.test.data

import android.content.Context
import com.example.test.R
import timber.log.Timber

class SharedPreferencesManager(
   private val context: Context
) {
   fun sayMeow() {
      val str = context.getString(R.string.app_name)
      Timber.tag("test_dagger")
      Timber.d("$str: meow ^-^")
   }
}