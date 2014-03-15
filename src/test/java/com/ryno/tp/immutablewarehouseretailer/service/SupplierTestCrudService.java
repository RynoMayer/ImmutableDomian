/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service;

import com.ryno.tp.immutablewarehouseretailer.model.employees.Manager;
import com.ryno.tp.immutablewarehouseretailer.model.supplier.supplier;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.ManagerCrudService;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.SupplierCrudService;
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
public class SupplierTestCrudService {
    
    public SupplierTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Mock
    SupplierCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SupplierCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        supplier supp1 = new supplier.Builder("Coca-Cola","softdrink").build();
        supplier returnSupplier = crudService.persist(supp1);
        when(crudService.persist(supp1)).thenReturn(returnSupplier);
        Mockito.verify(crudService).persist(supp1);


    }

    @Test
    public void testRead() throws Exception {
        supplier supp1 = new supplier.Builder("Coca-Cola","softdrink").build();
        supplier returnSupplier = crudService.find(supp1.getCompany());
        when(crudService.find(supp1.getCompany())).thenReturn(returnSupplier);
        Mockito.verify(crudService).find(supp1.getCompany());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        supplier supp1 = new supplier.Builder("Coca-Cola","softdrink").build();

        supplier returnSupplier = crudService.merge(supp1);
        when(crudService.merge(supp1)).thenReturn(returnSupplier);
        Mockito.verify(crudService).merge(supp1);

    }

    @Test
    public void testDelete() throws Exception {

        supplier supp1 = new supplier.Builder("Coca-Cola","softdrink").build();
        supplier returnSupplier = crudService.remove(supp1);
        when(crudService.remove(supp1)).thenReturn(returnSupplier);
        Mockito.verify(crudService).remove(supp1);

    }
}