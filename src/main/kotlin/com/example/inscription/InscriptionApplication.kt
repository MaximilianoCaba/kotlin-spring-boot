package com.example.inscription

import com.example.inscription.entity.Person
import com.example.inscription.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InscriptionApplication : CommandLineRunner {

    @Autowired
    lateinit var personRepository: PersonRepository

    override fun run(vararg args: String?) {
        personRepository.deleteAll()

        personRepository.save(Person("Maxi", "Caba"))
        personRepository.save(Person("Diego", "Veron"))

        personRepository.findAll().forEach { println("Person ${it.firstName} ${it.lastName} in DB") }
    }

}

fun main(args: Array<String>) {
    runApplication<InscriptionApplication>(*args)
}







