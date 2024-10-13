package com.example.kontacts

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="contacts")
data class Contact(
    @PrimaryKey(autoGenerate=true) val id: Int,
    val image: String,
    val name: String,
    val phone: String,
    val email: String
)
