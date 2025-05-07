package com.diniauliya0015.asessment2mobpro.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diniauliya0015.asessment2mobpro.database.ResepDao
import com.diniauliya0015.asessment2mobpro.model.Resep
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn


class MainViewModel(dao: ResepDao) : ViewModel(){
    val data: StateFlow<List<Resep>> = dao.getResep().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )
    fun getResep(id: Long): Resep? {
        return data.value.find { it.id == id }
    }

}