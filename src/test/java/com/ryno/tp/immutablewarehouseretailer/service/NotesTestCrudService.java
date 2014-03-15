/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service;

import com.ryno.tp.immutablewarehouseretailer.model.employees.Manager;
import com.ryno.tp.immutablewarehouseretailer.model.till.notes;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.ManagerCrudService;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.NotesCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ryno
 */
public class NotesTestCrudService {
    
    public NotesTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Mock
    NotesCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(NotesCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        notes noteA = new notes.Builder("R",200).build();
        notes returnNote = crudService.persist(noteA);
        when(crudService.persist(noteA)).thenReturn(returnNote);
        Mockito.verify(crudService).persist(noteA);


    }

    @Test
    public void testRead() throws Exception {
         notes noteA = new notes.Builder("R",200).build();
        notes returnNote = crudService.find(noteA.getAbbv());
        when(crudService.find(noteA.getAbbv())).thenReturn(returnNote);
        Mockito.verify(crudService).find(noteA.getAbbv());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

         notes noteA = new notes.Builder("R",200).build();

        notes returnNote = crudService.merge(noteA);
        when(crudService.merge(noteA)).thenReturn(returnNote);
        Mockito.verify(crudService).merge(noteA);

    }

    @Test
    public void testDelete() throws Exception {

        notes noteA = new notes.Builder("R",200).build();
        notes returnNote = crudService.remove(noteA);
        when(crudService.remove(noteA)).thenReturn(returnNote);
        Mockito.verify(crudService).remove(noteA);

    }
}