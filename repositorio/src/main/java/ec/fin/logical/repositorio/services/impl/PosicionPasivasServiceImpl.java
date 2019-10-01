package ec.fin.logical.repositorio.services.impl;

import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.fin.logical.repositorio.dao.PosicionPasivasDao;
import ec.fin.logical.repositorio.dao.VariacionPasivasDao;
import ec.fin.logical.repositorio.models.PosicionPasivas;
import ec.fin.logical.repositorio.models.VariacionPasivas;
import ec.fin.logical.repositorio.services.PosicionPasivasService;

@Service
public class PosicionPasivasServiceImpl implements PosicionPasivasService {

    @Autowired
    private PosicionPasivasDao daoPosicion;

    @Autowired
    private VariacionPasivasDao daoVariacion;

    @Override
    public List<PosicionPasivas> findAll() throws Exception {
        return daoPosicion.findAll();
    }

    @Override
    public List<PosicionPasivas> buscarPosicionPorFecha(String fecha) throws Exception {
        LocalDate fechaFinal = new LocalDate(fecha);
        LocalDate fechaInicial = fechaFinal.minusYears(1).dayOfMonth().withMaximumValue();
        return daoPosicion.buscarPorFecha(fechaInicial.toString(), fechaFinal.toString());
    }

    @Override
    public List<PosicionPasivas> buscarPosicionPorFecha(String fecha, String tipoInstitucion) throws Exception {
        LocalDate fechaFinal = new LocalDate(fecha);
        LocalDate fechaInicial = fechaFinal.minusYears(1).dayOfMonth().withMaximumValue();

        if (!tipoInstitucion.equalsIgnoreCase("todas")) {
            return daoPosicion.buscarPorFecha(fechaInicial.toString(), fechaFinal.toString(), tipoInstitucion);
        } else {
            return daoPosicion.buscarPorFecha(fechaInicial.toString(), fechaFinal.toString());
        }
    }

    @Override
    public List<VariacionPasivas> buscarVariacionPorFecha(String fecha) throws Exception {
        return daoVariacion.buscarPorFecha(fecha);
    }

    @Override
    public List<VariacionPasivas> buscarVariacionPorFecha(String fecha, String tipoInstitucion) throws Exception {
        if (!tipoInstitucion.equalsIgnoreCase("todas")) {
            return daoVariacion.buscarPorFecha(fecha, tipoInstitucion);
        } else {
            return daoVariacion.buscarPorFecha(fecha);
        }
    }
}