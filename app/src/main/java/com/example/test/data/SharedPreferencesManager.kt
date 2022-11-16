package com.example.test.data

import android.content.Context
import timber.log.Timber

class SharedPreferencesManager(
   private val context: Context
) {
   fun sayMeow() {
      Timber.tag("test_dagger")
      Timber.d("meow ^-^")
   }
}