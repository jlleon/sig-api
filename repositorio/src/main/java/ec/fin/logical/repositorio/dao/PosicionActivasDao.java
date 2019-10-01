package ec.fin.logical.repositorio.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import ec.fin.logical.repositorio.models.PosicionActivas;

public interface PosicionActivasDao extends MongoRepository<PosicionActivas, String>{
    @Query("{ 'fecha': { $gte: ?0, $lte: ?1 } }")
    public List<PosicionActivas> buscarPorFecha(String fechaInicial, String fechaFinal) throws Exception;

    @Query("{ $and: [ { 'fecha': { $gte: ?0, $lte: ?1 } }, { 'tipo_institucion': ?2} ] }")
    public List<PosicionActivas> buscarPorFecha(String fechaInicial, String fechaFinal, String tipoInstitucion) throws Exception;
}