package net.unir.mongoDemo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.unir.mongoDemo.api.dto.ApiResponse;
import net.unir.mongoDemo.api.dto.EstadoApiResponseEnum;
import net.unir.mongoDemo.servicios.Institucion_FinancieraService;

@RestController
@RequestMapping(value= "/sig/administracion/institucion_financiera")
public class Institucion_FinancieraApi{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Institucion_FinancieraService serv;
    
    @CrossOrigin("*")
    @GetMapping(value= "/obtenerInstitucionesFinancieras")
	public ApiResponse getAll() {
		logger.debug("Obteniendo Instituciones...");        
        return new ApiResponse(EstadoApiResponseEnum.OK.getCode(), serv.getAllInstitucion_Financiera());		
	}
}