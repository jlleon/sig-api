package ec.fin.logical.repositorio.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import ec.fin.logical.repositorio.models.VariacionPasivas;

public interface VariacionPasivasDao extends MongoRepository<VariacionPasivas, String>{
    @Query("{ 'fecha': ?0 }")
    public List<VariacionPasivas> buscarPorFecha(String fecha) throws Exception;
    @Query("{ $and: [ { 'fecha': ?0 }, { 'tipo_institucion': ?1 } ] }")
    public List<VariacionPasivas> buscarPorFecha(String fecha, String tipoInstitucion) throws Exception;
}