package net.unir.mongoDemo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.unir.mongoDemo.modelo.Modulo;

@Repository
public interface ModuloDao extends MongoRepository<Modulo, String> {

}