package com.diniauliya0015.asessment2mobpro.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "resep")
data class Resep(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val namaResep: String,
    val bahan: String,
    val langkah: String,
)
