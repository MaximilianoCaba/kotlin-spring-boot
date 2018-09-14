package com.example.inscription.repository

import com.example.inscription.entity.Signature
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SignatureRepository : MongoRepository<Signature, String>