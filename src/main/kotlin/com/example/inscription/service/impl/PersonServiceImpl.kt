package com.example.inscription.service.impl

import com.example.inscription.entity.Person
import com.example.inscription.repository.PersonRepository
import com.example.inscription.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PersonServiceImpl : PersonService {

    @Autowired
    lateinit var personRepository: PersonRepository

    override fun getAllPerson(): List<Person> {
        return personRepository.findAll()
    }

    override fun getPerson(id: String): Optional<Person> {
        return personRepository.findById(id)
    }

    override fun savePerson(person: Person): Person {
        return personRepository.save(person)
    }

}