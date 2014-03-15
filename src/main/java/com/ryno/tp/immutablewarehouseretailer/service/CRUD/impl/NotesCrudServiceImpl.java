/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl;

import com.ryno.tp.immutablewarehouseretailer.model.employees.Manager;
import com.ryno.tp.immutablewarehouseretailer.model.till.notes;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.NotesCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ryno
 */
public class NotesCrudServiceImpl implements NotesCrudService{
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public notes find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public notes persist(notes entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public notes merge(notes entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public notes remove(notes entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<notes> findAll() {
        return null;
    }
}
