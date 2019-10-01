package ec.fin.logical.repositorio.services;

import java.util.List;

import ec.fin.logical.repositorio.models.PosicionActivas;
import ec.fin.logical.repositorio.models.VariacionActivas;

public interface PosicionActivasService {
    public List<PosicionActivas> findAll() throws Exception;
    public List<PosicionActivas> buscarPosicionPorFecha(String fecha) throws Exception;    
    public List<VariacionActivas> buscarVariacionPorFecha(String fecha) throws Exception;    
    public List<PosicionActivas> buscarPosicionPorFecha(String fecha, String tipoInstitucion) throws Exception;    
    public List<VariacionActivas> buscarVariacionPorFecha(String fecha, String tipoInstitucion) throws Exception;  
}