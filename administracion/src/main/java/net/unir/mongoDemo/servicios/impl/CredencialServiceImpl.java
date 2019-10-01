package net.unir.mongoDemo.servicios.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.unir.mongoDemo.dao.CredencialDao;
import net.unir.mongoDemo.dao.ModuloDao;
import net.unir.mongoDemo.dao.PersonaDao;
import net.unir.mongoDemo.dao.RolDao;
import net.unir.mongoDemo.modelo.Credencial;
import net.unir.mongoDemo.modelo.Modulo;
import net.unir.mongoDemo.modelo.Persona;
import net.unir.mongoDemo.modelo.Rol;
import net.unir.mongoDemo.modelo.dto.CredencialDto;
import net.unir.mongoDemo.servicios.CredencialService;

@Service
public class CredencialServiceImpl implements CredencialService {

    @Autowired
    CredencialDao credencialDao;

    @Autowired
    PersonaDao personaDao;

    @Autowired
    RolDao rolDao;    
    
    @Autowired
    ModuloDao moduloDao;

    @Override
    public Credencial createCredencial(Credencial obj) {
        Optional<Credencial> credencial = credencialDao.findById(obj.get_id());
        if (credencial.isPresent())
            return null;
        credencialDao.save(obj);
        return obj;
    }

    @Override
    public void createCredencial(List<Credencial> objs) {
        credencialDao.saveAll(objs);
    }

    @Override
    public Collection<Credencial> getAllCredencial() {
        return credencialDao.findAll();
    }

    @Override
    public Optional<Credencial> findCredencialById(String id) {
        return credencialDao.findById(id);
    }

    @Override
    public void deleteCredencialById(String id) {
        credencialDao.deleteById(id);
    }

    @Override
    public void updateCredencial(Credencial obj) {
        credencialDao.save(obj);
	}

    @Override
    public CredencialDto autenticar(String _id, String password) {
        
        CredencialDto res = new CredencialDto();
        try
        {            
            Optional<Credencial> credencial = credencialDao.findById(_id);                    
            if (credencial.get().getPassword().equals(password)){        
                res.set_id(_id);
                
                Optional<Persona> persona = personaDao.findById(credencial.get().getIdentificacion());
                res.setNombre(persona.get().getNombre());              
                res.setApellido(persona.get().getApellido());
                res.setInstitucion(persona.get().getInstitucion());
                res.setEmail(persona.get().getEmail());
                res.setRol(credencial.get().getRol());

                Optional<Rol> rol = rolDao.findById(credencial.get().getRol());
                res.setTipo_institucion(rol.get().getTipo_institucion());            
        
                Collection<Modulo> lstmodulos = new ArrayList<Modulo>();
                for (String modulo_id : rol.get().getModulos()) {
                    Optional<Modulo> modulo = moduloDao.findById(modulo_id);
                    lstmodulos.add(modulo.get());
                }            
                res.setModulos(lstmodulos);    
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return res;
    }

}