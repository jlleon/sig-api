package net.unir.mongoDemo.servicios.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.unir.mongoDemo.dao.PersonaDao;
import net.unir.mongoDemo.modelo.Persona;
import net.unir.mongoDemo.servicios.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaDao personaDao;

    @Override
	public Collection<Persona> getAllPersona() {
		return personaDao.findAll();
	}

    @Override
    public Persona createPersona(Persona obj) {
        Optional<Persona> credencial = personaDao.findById(obj.get_id());
        if (credencial.isPresent())
            return null;
        return personaDao.save(obj);
    }


}