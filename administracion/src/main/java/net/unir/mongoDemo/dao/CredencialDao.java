package net.unir.mongoDemo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.unir.mongoDemo.modelo.Credencial;

@Repository
public interface CredencialDao extends MongoRepository<Credencial, String> {

}