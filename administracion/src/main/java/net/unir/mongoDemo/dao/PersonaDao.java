package net.unir.mongoDemo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.unir.mongoDemo.modelo.Persona;

@Repository
public interface PersonaDao extends MongoRepository<Persona, String> {

}