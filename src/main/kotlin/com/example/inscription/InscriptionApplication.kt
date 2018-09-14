package com.example.inscription

import com.example.inscription.entity.Class
import com.example.inscription.entity.Person
import com.example.inscription.entity.Signature
import com.example.inscription.repository.ClassRepository
import com.example.inscription.repository.PersonRepository
import com.example.inscription.repository.SignatureRepository
import com.google.gson.GsonBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InscriptionApplication : CommandLineRunner {

    @Autowired
    lateinit var personRepository: PersonRepository

    @Autowired
    lateinit var classRepository: ClassRepository

    @Autowired
    lateinit var signatureRepository: SignatureRepository

    override fun run(vararg args: String?) {

        val gson = GsonBuilder().setPrettyPrinting().create()

        val maxi = Person("Maxi", "Caba", 11234567)
        val diego = Person("Diego", "Veron", 22334567)
        val boss = Person("Diego", "Maradona", 12214214)
        val teacher = Person("Caruso", "Lombardi", 21542151)

        val maxiSaved = personRepository.save(maxi)
        val diegoSaved = personRepository.save(diego)
        val bossSaved = personRepository.save(boss)
        val teacherSaved = personRepository.save(teacher)

        val signatureFootball = Signature("Futbol", bossSaved)

        val signatureSalved = signatureRepository.save(signatureFootball)


        val classFootball = Class(signatureSalved, teacherSaved, arrayListOf(maxiSaved, diegoSaved))

        val classSaved = classRepository.save(classFootball)

        println(gson.toJson(classSaved))

    }

}

fun main(args: Array<String>) {
    runApplication<InscriptionApplication>(*args)
}







