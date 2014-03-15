/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl;

import com.ryno.tp.immutablewarehouseretailer.model.till.notes;
import com.ryno.tp.immutablewarehouseretailer.model.transaction.cash;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.CashCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ryno
 */
public class CashCrudServiceImpl implements CashCrudService{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public cash find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public cash persist(cash entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public cash merge(cash entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public cash remove(cash entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<cash> findAll() {
        return null;
    }
}
