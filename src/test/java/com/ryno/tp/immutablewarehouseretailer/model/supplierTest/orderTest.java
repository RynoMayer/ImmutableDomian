/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.supplierTest;

import com.ryno.tp.immutablewarehouseretailer.model.product.sportware;
import com.ryno.tp.immutablewarehouseretailer.model.supplier.order;
import org.testng.Assert;
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
public class orderTest {
    
    public orderTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation(){
        
        order orderA = new order.Builder("Fanta","ItmFanta001","Coca-Cola","softdrink").build();
        Assert.assertEquals(orderA.getBarcode(),"ItmFanta001");
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        order orderB = new order.Builder("hammer","ItmHammer005","stahl","hardware").build();
        Assert.assertEquals(orderB.getCompany(),"stahl");
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}