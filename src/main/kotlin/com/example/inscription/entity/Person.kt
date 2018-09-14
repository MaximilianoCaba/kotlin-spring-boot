package com.example.inscription.entity

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection="persons")
@TypeAlias("persons")
class Person {

    @Id
    var id: String? = null

    var firstName: String? = ""
    var lastName: String? = ""
    var identificationNumber: Int? = 0

    constructor() {}

    constructor(firstName: String, lastName: String, identificationNumber : Int) {
        this.firstName = firstName
        this.lastName = lastName
        this.identificationNumber = identificationNumber
    }


}