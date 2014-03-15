/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service.CRUD.impl;

import com.ryno.tp.immutablewarehouseretailer.model.Author;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.AuthorCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ryno
 */
public class AuthorCrudServiceImpl implements AuthorCrudService {
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Author find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Author persist(Author entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Author merge(Author entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Author remove(Author entity) {

        return  null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Author> findAll() {
        return null;
    }
}
