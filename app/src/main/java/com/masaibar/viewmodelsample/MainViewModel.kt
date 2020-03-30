package com.masaibar.viewmodelsample

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    init {
        Log.d("MainViewModel", "init")
    }

    fun hello() {
        Log.d("MainViewModel", "hello")
    }
}
