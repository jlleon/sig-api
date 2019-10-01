package net.unir.mongoDemo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.unir.mongoDemo.api.dto.ApiResponse;
import net.unir.mongoDemo.api.dto.EstadoApiResponseEnum;
import net.unir.mongoDemo.modelo.Persona;
import net.unir.mongoDemo.servicios.PersonaService;

@RestController 
@RequestMapping(value= "/sig/administracion/persona")
public class PersonaApi{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonaService serv;

    @CrossOrigin("*")
    @GetMapping(value= "/obtenerPersonas")
	public ApiResponse getAll() {
		logger.debug("Obteniendo Personas...");        
        return new ApiResponse(EstadoApiResponseEnum.OK.getCode(), serv.getAllPersona());
    }
    
    @CrossOrigin("*")
    @PostMapping(value= "/crear")
	public ApiResponse crear(@RequestBody Persona obj) {
		logger.debug("Creando...");        
        return new ApiResponse(EstadoApiResponseEnum.OK.getCode(), serv.createPersona(obj) );		
	}
}