/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.service;

import com.ryno.tp.immutablewarehouseretailer.model.employees.Manager;
import com.ryno.tp.immutablewarehouseretailer.model.product.Item;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.ItemCrudService;
import com.ryno.tp.immutablewarehouseretailer.service.CRUD.ManagerCrudService;
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
public class ItemTestCrudService {
    
    public ItemTestCrudService() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Mock
    ItemCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ItemCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        Item ItemA = new Item.ItemBuilder("Itm007b").setType("toys").build();
        Item returnItem = crudService.persist(ItemA);
        when(crudService.persist(ItemA)).thenReturn(returnItem);
        Mockito.verify(crudService).persist(ItemA);


    }

    @Test
    public void testRead() throws Exception {
        Item ItemA = new Item.ItemBuilder("Itm007b").setType("toys").build();
        Item returnItem = crudService.find(ItemA.getBarcode());
        when(crudService.find(ItemA.getBarcode())).thenReturn(returnItem);
        Mockito.verify(crudService).find(ItemA.getBarcode());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT

         Item ItemA = new Item.ItemBuilder("Itm007b").setType("toys").build();

        Item returnItem = crudService.merge(ItemA);
        when(crudService.merge(ItemA)).thenReturn(returnItem);
        Mockito.verify(crudService).merge(ItemA);

    }

    @Test
    public void testDelete() throws Exception {

        Item ItemA = new Item.ItemBuilder("Itm007b").setType("toys").build();
        Item returnItem = crudService.remove(ItemA);
        when(crudService.remove(ItemA)).thenReturn(returnItem);
        Mockito.verify(crudService).remove(ItemA);

    }
}