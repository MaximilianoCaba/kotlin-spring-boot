package com.example.inscription.entity

import io.github.kaiso.relmongo.annotation.*
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection="class")
@TypeAlias("class")
class Class {

    @Id
    var id: String? = null

    @OneToOne(fetch= FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinProperty(name="signature")
    var signature: Signature? = null

    @OneToOne(fetch= FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinProperty(name="persons")
    var teacher: Person? = null

    @OneToMany(fetch= FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinProperty(name="persons")
    var listStudents: List<Person>? = arrayListOf()

    constructor(signature: Signature?, teacher: Person?, listStudents: List<Person>?) {
        this.signature = signature
        this.teacher = teacher
        this.listStudents = listStudents
    }
}