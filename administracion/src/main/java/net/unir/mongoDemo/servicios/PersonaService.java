package net.unir.mongoDemo.servicios;

import java.util.Collection;

import net.unir.mongoDemo.modelo.Persona;

public interface PersonaService {
 
    public Persona createPersona(Persona obj);

    public Collection<Persona> getAllPersona();

}

