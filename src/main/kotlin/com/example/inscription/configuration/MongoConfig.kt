package com.example.inscription.configuration

import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean
import io.github.kaiso.relmongo.config.EnableRelMongo
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.MongoTemplate
import java.io.IOException

@Configuration
@EnableRelMongo
class MongoConfig {

    @Bean
    @Throws(IOException::class)
    fun mongoTemplate(): MongoTemplate {
        val mongo = EmbeddedMongoFactoryBean()
        mongo.setBindIp(StaticValueConfig.mongo_db_url())
        mongo.setPort(StaticValueConfig.mongo_db_port())
        return MongoTemplate(mongo.getObject()!!, StaticValueConfig.mongo_db_name())
    }

}