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
import net.unir.mongoDemo.servicios.RolService;

@RestController
@RequestMapping(value= "/sig/administracion/rol")
public class RolApi{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RolService serv;

    @CrossOrigin("*")
    @GetMapping(value= "/obtenerRoles")
	public ApiResponse getAll() {
		logger.debug("Obteniendo Roles...");        
        return new ApiResponse(EstadoApiResponseEnum.OK.getCode(), serv.getAllRol());
    }
    
}