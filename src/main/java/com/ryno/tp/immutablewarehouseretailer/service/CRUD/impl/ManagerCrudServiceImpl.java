/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl;


import com.ryno.tp.immutablewarehouseretailer.model.employees.Manager;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.ManagerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ryno
 */
public class ManagerCrudServiceImpl implements ManagerCrudService {
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Manager find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Manager persist(Manager entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Manager merge(Manager entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Manager remove(Manager entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Manager> findAll() {
        return null;
    }   
}
