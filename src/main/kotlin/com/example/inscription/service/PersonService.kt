package com.example.inscription.service

import com.example.inscription.entity.Person
import java.util.*

interface PersonService {

    fun getAllPerson() : List<Person>

    fun getPerson(id : String) : Optional<Person>

    fun savePerson(person: Person) : Person
}