package com.example.kontacts

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Contact::class], version = 1, exportSchema = false)
abstract class ContactDB: RoomDatabase() {
    abstract fun contactDao(): ContactDAO
}