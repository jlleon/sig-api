package net.unir.mongoDemo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.unir.mongoDemo.modelo.Rol;

@Repository
public interface RolDao extends MongoRepository<Rol, String> {

}