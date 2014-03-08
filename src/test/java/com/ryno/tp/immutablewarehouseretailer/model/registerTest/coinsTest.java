/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.registerTest;

import com.ryno.tp.immutablewarehouseretailer.model.supplier.order;
import com.ryno.tp.immutablewarehouseretailer.model.till.Coins;
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
public class coinsTest {
    
    public coinsTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testCreation(){
        
        Coins coinA = new Coins.Builder("R",2).build();
        Assert.assertEquals(coinA.getValue(),2);
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Coins coinB = new Coins.Builder("R",5).build();
        Assert.assertEquals(coinB.getAbbv(),"R");
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