package ec.fin.logical.repositorio.services.impl;

import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.fin.logical.repositorio.dao.PosicionActivasDao;
import ec.fin.logical.repositorio.dao.VariacionActivasDao;
import ec.fin.logical.repositorio.models.PosicionActivas;
import ec.fin.logical.repositorio.models.VariacionActivas;
import ec.fin.logical.repositorio.services.PosicionActivasService;

@Service
public class PosicionActivasServiceImpl implements PosicionActivasService {

    @Autowired
    private PosicionActivasDao daoPosicion;

    @Autowired
    private VariacionActivasDao daoVariacion;

    @Override
    public List<PosicionActivas> findAll() throws Exception {
        return daoPosicion.findAll();
    }

    @Override
    public List<PosicionActivas> buscarPosicionPorFecha(String fecha) throws Exception {
        LocalDate fechaFinal = new LocalDate(fecha);
        LocalDate fechaInicial = fechaFinal.minusYears(1).dayOfMonth().withMaximumValue();
        return daoPosicion.buscarPorFecha(fechaInicial.toString(), fechaFinal.toString());
    }

    @Override
    public List<PosicionActivas> buscarPosicionPorFecha(String fecha, String tipoInstitucion) throws Exception {
        LocalDate fechaFinal = new LocalDate(fecha);
        LocalDate fechaInicial = fechaFinal.minusYears(1).dayOfMonth().withMaximumValue();
        
        if (!tipoInstitucion.equalsIgnoreCase("todas")) {
            return daoPosicion.buscarPorFecha(fechaInicial.toString(), fechaFinal.toString(), tipoInstitucion);
        } else {
            return daoPosicion.buscarPorFecha(fechaInicial.toString(), fechaFinal.toString());
        }        
    }

    @Override
    public List<VariacionActivas> buscarVariacionPorFecha(String fecha) throws Exception {
        return daoVariacion.buscarPorFecha(fecha);
    }

    @Override
    public List<VariacionActivas> buscarVariacionPorFecha(String fecha, String tipoInstitucion) throws Exception {
        if (!tipoInstitucion.equalsIgnoreCase("todas")) {
            return daoVariacion.buscarPorFecha(fecha, tipoInstitucion);
        } else {
            return daoVariacion.buscarPorFecha(fecha);
        } 
    }
}