package com.example.firebase_database

class UserModel {


    lateinit var name:String
    lateinit var surname:String
    lateinit var contact:String
    lateinit var address:String


    constructor(name: String, surname: String, contact: String, address: String) {
        this.name = name
        this.surname = surname
        this.contact = contact
        this.address = address
    }
}