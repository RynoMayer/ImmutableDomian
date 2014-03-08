/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.registerTest;

import com.ryno.tp.immutablewarehouseretailer.model.till.Coins;
import com.ryno.tp.immutablewarehouseretailer.model.till.receipt;
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
public class receiptTest {
    
    public receiptTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation(){
        
        receipt receipt1 = new receipt.Builder().setDescr("coke").setPrice(10.50).setQty(2).setTotal().build();
        Assert.assertEquals(receipt1.getPrice(),10.50);
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        receipt receipt2 = new receipt.Builder().setDescr("choc").setPrice(8.95).setQty(10).setTotal().build();
        Assert.assertEquals(receipt2.getTotal(),89.5);
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