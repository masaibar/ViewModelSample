package com.masaibar.viewmodelsample

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(
    private val userId: String
) : ViewModel() {
    init {
        Log.d("MainViewModel", "init, userId: $userId")
    }

    fun hello() {
        Log.d("MainViewModel", "hello, userId: $userId")
    }
}
