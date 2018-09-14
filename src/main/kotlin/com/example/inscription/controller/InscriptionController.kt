package com.example.inscription.controller

import com.example.inscription.entity.Person
import com.example.inscription.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class InscriptionController {

    @Autowired
    lateinit var personService : PersonService

    @GetMapping("/allPerson")
    fun getAllPerson(): List<Person> {
        return personService.getAllPerson()
    }

    @GetMapping("/{id}")
    fun getAllPerson(@PathVariable id: String): Optional<Person> {
        return personService.getPerson(id)
    }

    @GetMapping("/newPerson/{firstName}/{lastName}")
    fun savePerson(@PathVariable firstName: String, @PathVariable lastName: String): Person {

        val person = Person(firstName, lastName)
        return personService.savePerson(person)
    }

}
