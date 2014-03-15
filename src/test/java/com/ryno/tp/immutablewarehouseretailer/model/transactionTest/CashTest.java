/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.transactionTest;

import com.ryno.tp.immutablewarehouseretailer.model.supplier.order;
import com.ryno.tp.immutablewarehouseretailer.model.transaction.cash;
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
public class CashTest {
    
    public CashTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation(){
        
        cash cash1 = new cash.Builder(200,"orange").build();
        Assert.assertEquals(cash1.getColor(),"orange");
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        cash cash2 = new cash.Builder(100,"blue").build();
        Assert.assertEquals(cash2.getColor(),"blue");
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