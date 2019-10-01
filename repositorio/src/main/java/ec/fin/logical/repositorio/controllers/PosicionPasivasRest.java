package ec.fin.logical.repositorio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ec.fin.logical.repositorio.models.PosicionPasivas;
import ec.fin.logical.repositorio.models.VariacionPasivas;
import ec.fin.logical.repositorio.services.PosicionPasivasService;

@RestController
@RequestMapping("/pasivas")
public class PosicionPasivasRest {

    @Autowired
    private PosicionPasivasService service;

    @CrossOrigin("*")
    @RequestMapping(value = "/posicion/", method = RequestMethod.GET)
    @ResponseBody
    public List<PosicionPasivas> obtenerTodos() {
        try {
            return service.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/posicion/buscar/fecha/{fecha}", method = RequestMethod.GET)
    @ResponseBody
    public List<PosicionPasivas> buscarPorFecha(@PathVariable(value = "fecha") String fecha) {
        try {
            return service.buscarPosicionPorFecha(fecha);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/posicion/buscar/fecha/{fecha}/{tipoInstitucion}", method = RequestMethod.GET)
    @ResponseBody
    public List<PosicionPasivas> buscarPorFecha(@PathVariable(value = "fecha") String fecha, @PathVariable(value = "tipoInstitucion") String tipoInstitucion) {
        try {
            return service.buscarPosicionPorFecha(fecha, tipoInstitucion);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/variacion/buscar/fecha/{fecha}", method = RequestMethod.GET)
    @ResponseBody
    public List<VariacionPasivas> buscarVariacionPorFecha(@PathVariable(value = "fecha") String fecha) {
        try {
            return service.buscarVariacionPorFecha(fecha);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/variacion/buscar/fecha/{fecha}/{tipoInstitucion}", method = RequestMethod.GET)
    @ResponseBody
    public List<VariacionPasivas> buscarVariacionPorFecha(@PathVariable(value = "fecha") String fecha, @PathVariable(value = "tipoInstitucion") String tipoInstitucion) {
        try {
            return service.buscarVariacionPorFecha(fecha, tipoInstitucion);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}