package com.example.inscription.configuration

import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.MongoTemplate
import java.io.IOException

@Configuration
class MongoConfig {

    private val MONGO_DB_URL = "localhost"
    private val MONGO_DB_NAME = "embeded_db"
    private val MONGO_DB_PORT = 27017

    @Bean
    @Throws(IOException::class)
    fun mongoTemplate(): MongoTemplate {
        val mongo = EmbeddedMongoFactoryBean()
        mongo.setBindIp(MONGO_DB_URL)
        mongo.setPort(MONGO_DB_PORT)
        var mongoTemplate = MongoTemplate(mongo.getObject()!!, MONGO_DB_NAME)
        return mongoTemplate
    }

}