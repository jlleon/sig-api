package ec.fin.logical.repositorio.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import ec.fin.logical.repositorio.models.VariacionActivas;

public interface VariacionActivasDao extends MongoRepository<VariacionActivas, String>{
    @Query("{ 'fecha': ?0 }")
    public List<VariacionActivas> buscarPorFecha(String fecha) throws Exception;
    @Query("{ $and: [ { 'fecha': ?0 }, { 'tipo_institucion': ?1 } ] }")
    public List<VariacionActivas> buscarPorFecha(String fecha, String tipoInstitucion) throws Exception;
}