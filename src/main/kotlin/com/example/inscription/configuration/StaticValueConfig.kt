package com.example.inscription.configuration

class StaticValueConfig {

    companion object {
        fun mongo_db_url() : String = "localhost"
        fun mongo_db_name() : String = "embeded_db"
        fun mongo_db_port() : Int = 27017
    }

}