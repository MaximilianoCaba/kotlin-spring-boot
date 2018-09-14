package com.example.inscription.entity

import io.github.kaiso.relmongo.annotation.CascadeType
import io.github.kaiso.relmongo.annotation.FetchType
import io.github.kaiso.relmongo.annotation.JoinProperty
import io.github.kaiso.relmongo.annotation.OneToOne
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection="signature")
@TypeAlias("signature")
class Signature {

    @Id
    var id: String? = null

    var name: String? = null

    @OneToOne(fetch= FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinProperty(name="persons")
    var boss: Person? = null

    constructor(name: String?, boss: Person?) {
        this.name = name
        this.boss = boss
    }
}