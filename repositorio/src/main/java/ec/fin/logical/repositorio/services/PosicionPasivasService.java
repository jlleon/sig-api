package ec.fin.logical.repositorio.services;

import java.util.List;

import ec.fin.logical.repositorio.models.PosicionPasivas;
import ec.fin.logical.repositorio.models.VariacionPasivas;

public interface PosicionPasivasService {
    public List<PosicionPasivas> findAll() throws Exception;
    public List<PosicionPasivas> buscarPosicionPorFecha(String fecha) throws Exception;
    public List<VariacionPasivas> buscarVariacionPorFecha(String fecha) throws Exception;
    public List<PosicionPasivas> buscarPosicionPorFecha(String fecha, String tipoInstitucion) throws Exception;
    public List<VariacionPasivas> buscarVariacionPorFecha(String fecha, String tipoInstitucion) throws Exception;
}