package com.diniauliya0015.asessment2mobpro.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.diniauliya0015.asessment2mobpro.model.Resep
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = [Resep::class], version = 1, exportSchema = false)
abstract class ResepDb : RoomDatabase() {

    abstract val dao: ResepDao

    companion object {
        @Volatile
        private var INSTANCE: ResepDb? = null

        @OptIn(InternalCoroutinesApi::class)
        fun getInstance(context: Context): ResepDb {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ResepDb::class.java,
                        "resep.db"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}