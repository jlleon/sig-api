package net.unir.mongoDemo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.unir.mongoDemo.modelo.Institucion_Financiera;

@Repository
public interface Institucion_FinancieraDao extends MongoRepository<Institucion_Financiera, String> {

}