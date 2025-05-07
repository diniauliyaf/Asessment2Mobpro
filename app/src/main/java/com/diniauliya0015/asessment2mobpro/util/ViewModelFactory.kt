package com.diniauliya0015.asessment2mobpro.util

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.diniauliya0015.asessment2mobpro.database.ResepDb
import com.diniauliya0015.asessment2mobpro.ui.screen.MainViewModel

class ViewModelFactory(
    private val context: Context
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val dao = ResepDb.getInstance(context).dao
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

