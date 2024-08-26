package com.ezpnix.oracleswift.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ezpnix.oracleswift.core.constant.DatabaseConst
import com.ezpnix.oracleswift.data.local.dao.NoteDao
import com.ezpnix.oracleswift.domain.model.Note

@Database(
    entities = [Note::class],
    version = DatabaseConst.NOTES_DATABASE_VERSION,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}