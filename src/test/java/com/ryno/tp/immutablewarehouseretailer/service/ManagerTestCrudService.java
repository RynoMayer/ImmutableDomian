/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service;

import com.ryno.tp.immutablewarehouseretailer.model.employees.Manager;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.ManagerCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.mockito.Mockito.when;
/**
 *
 * @author ryno
 */
public class ManagerTestCrudService {
    
    public ManagerTestCrudService() {
    }
    @Mock
    ManagerCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ManagerCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Manager man = new Manager.Builder("Ryno","Man007", 1500).Build();
        Manager returnQuestion = crudService.persist(man);
        when(crudService.persist(man)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(man);


    }

    @Test
    public void testRead() throws Exception {
         Manager man = new Manager.Builder("Ryno","Man007", 1500).Build();
        Manager returnQuestion = crudService.find(man.getName());
        when(crudService.find(man.getName())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(man.getName());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

         Manager man = new Manager.Builder("Ryno","Man007", 1500).Build();

        Manager returnQuestion = crudService.merge(man);
        when(crudService.merge(man)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(man);

    }

    @Test
    public void testDelete() throws Exception {

        Manager man = new Manager.Builder("Ryno","Man007", 1500).Build();
        Manager returnQuestion = crudService.remove(man);
        when(crudService.remove(man)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(man);

    }
}