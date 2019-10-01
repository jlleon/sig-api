package net.unir.mongoDemo.servicios.impl;

import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import net.unir.mongoDemo.dao.RolDao;
import net.unir.mongoDemo.modelo.Rol;
import net.unir.mongoDemo.servicios.RolService;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    RolDao rolDao;

    @Override
	public Collection<Rol> getAllRol() {
		return rolDao.findAll();
	}


}