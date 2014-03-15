/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl;

import com.ryno.tp.immutablewarehouseretailer.model.supplier.supplier;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.SupplierCrudService;
import com.ryno.tp.immutablewarehouseretailer.model.transaction.cash;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ryno
 */
public class SupplierCrudServiceImpl implements SupplierCrudService{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public supplier find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public supplier persist(supplier entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public supplier merge(supplier entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public supplier remove(supplier entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<supplier> findAll() {
        return null;
    }
}
