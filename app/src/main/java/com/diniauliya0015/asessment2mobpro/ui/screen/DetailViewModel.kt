package com.diniauliya0015.asessment2mobpro.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diniauliya0015.asessment2mobpro.database.ResepDao
import com.diniauliya0015.asessment2mobpro.model.Resep
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(private val dao: ResepDao) : ViewModel() {

        fun insert(id:Long, namaResep: String, bahan: String, langkah: String) {
            val resep = Resep(
                id = id,
                namaResep = namaResep,
                bahan = bahan,
                langkah = langkah
            )
            viewModelScope.launch(Dispatchers.IO) {
                dao.insert(resep)
            }
        }
    fun getResep(id: Long): Resep? {
        return null
    }
}