package com.example.inscription.repository

import com.example.inscription.entity.Class
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ClassRepository : MongoRepository<Class, String>