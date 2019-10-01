package net.unir.mongoDemo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.unir.mongoDemo.api.dto.ApiResponse;
import net.unir.mongoDemo.api.dto.EstadoApiResponseEnum;
import net.unir.mongoDemo.modelo.Credencial;
import net.unir.mongoDemo.servicios.CredencialService;

@RestController
@RequestMapping(value= "/sig/administracion/credencial")
public class CredencialApi{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
	CredencialService serv;
 
	@CrossOrigin("*")
	@GetMapping(value= "/autenticar/{credencial_id}/{password}")
	public ApiResponse autenticar(@PathVariable(value= "credencial_id") String _id, @PathVariable(value= "password") String password) {
		logger.debug("Autenticando...");        
        return new ApiResponse(EstadoApiResponseEnum.OK.getCode(), serv.autenticar(_id, password));		
	}

	@CrossOrigin("*")
	@PostMapping(value= "/crear")
	public ApiResponse crear(@RequestBody Credencial obj) {
		logger.debug("Creando...");        
        return new ApiResponse(EstadoApiResponseEnum.OK.getCode(), serv.createCredencial(obj) );		
	}

}