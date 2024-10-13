package com.example.kontacts

import kotlinx.coroutines.flow.Flow

class ContactRepository(private val contactDAO: ContactDAO) {

    val allContacts: Flow<List<Contact>> = contactDAO.getAllContacts()

    suspend fun insert(contact: Contact) {
        contactDAO.insert(contact)
    }

    suspend fun update(contact: Contact) {
        contactDAO.update(contact)
    }

    suspend fun delete(contact: Contact) {
        contactDAO.delete(contact)
    }

}