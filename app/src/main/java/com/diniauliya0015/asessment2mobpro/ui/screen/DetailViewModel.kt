package com.diniauliya0015.asessment2mobpro.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.diniauliya0015.asessment2mobpro.database.ResepDao
import com.diniauliya0015.asessment2mobpro.model.Resep
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(private val dao: ResepDao) : ViewModel() {

        fun insert(namaResep: String, bahan: String, langkah: String) {
            val resep = Resep(
                namaResep = namaResep,
                bahan = bahan,
                langkah = langkah
            )
            viewModelScope.launch(Dispatchers.IO) {
                dao.insert(resep)
            }
        }

    suspend fun getResep(id: Long): Resep? {
        return dao.getResepById(id)
    }
    fun update(id: Long, namaResep: String, bahan: String, langkah: String) {
        val catatan = Resep(
            id = id,
            namaResep = namaResep,
            bahan = bahan,
            langkah = langkah
        )
        viewModelScope.launch(Dispatchers.IO) {
            dao.update(catatan)
        }
    }
    fun delete(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.deleteById(id)
        }
    }
}