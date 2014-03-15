/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service;

import com.ryno.tp.immutablewarehouseretailer.model.product.Item;
import com.ryno.tp.immutablewarehouseretailer.model.transaction.cash;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.CashCrudService;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.ItemCrudService;
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
public class CashTestCrudService {
    
    public CashTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

   @Mock
    CashCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CashCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        cash cash1 = new cash.Builder(200,"orange").build();
        cash returnCash = crudService.persist(cash1);
        when(crudService.persist(cash1)).thenReturn(returnCash);
        Mockito.verify(crudService).persist(cash1);


    }

    @Test
    public void testRead() throws Exception {
        cash cash1 = new cash.Builder(200,"orange").build();
        cash returnCash = crudService.find(cash1.getColor());
        when(crudService.find(cash1.getColor())).thenReturn(returnCash);
        Mockito.verify(crudService).find(cash1.getColor());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

        cash cash1 = new cash.Builder(200,"orange").build();

        cash returnCash = crudService.merge(cash1);
        when(crudService.merge(cash1)).thenReturn(returnCash);
        Mockito.verify(crudService).merge(cash1);

    }

    @Test
    public void testDelete() throws Exception {

        cash cash1 = new cash.Builder(200,"orange").build();
        cash returnCash = crudService.remove(cash1);
        when(crudService.remove(cash1)).thenReturn(returnCash);
        Mockito.verify(crudService).remove(cash1);

    }
}