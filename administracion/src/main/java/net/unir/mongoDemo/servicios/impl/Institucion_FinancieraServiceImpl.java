package net.unir.mongoDemo.servicios.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.unir.mongoDemo.dao.Institucion_FinancieraDao;
import net.unir.mongoDemo.modelo.Institucion_Financiera;
import net.unir.mongoDemo.servicios.Institucion_FinancieraService;

@Service
public class Institucion_FinancieraServiceImpl implements Institucion_FinancieraService{

    @Autowired
    Institucion_FinancieraDao institucion_FinancieraDao;

    @Override
    public Collection<Institucion_Financiera> getAllInstitucion_Financiera() {
        return institucion_FinancieraDao.findAll();
    }

   
}