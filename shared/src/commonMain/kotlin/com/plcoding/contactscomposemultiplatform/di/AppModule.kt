package com.plcoding.contactscomposemultiplatform.di

import com.plcoding.contactscomposemultiplatform.contacts.domain.ContactDataSource

expect class AppModule {
    val contactsDataSource: ContactDataSource

}