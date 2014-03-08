/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.productTest;

import com.ryno.tp.immutablewarehouseretailer.model.product.Item;
import com.ryno.tp.immutablewarehouseretailer.model.product.stationary;
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
public class stationaryTest {
    
    public stationaryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

@Test
    public void testCreation(){
        
        stationary pencil = new stationary.Builder("Itmpencilhb").descrip("write").brand("hb").Build();
        Assert.assertEquals(pencil.getBarcode(),"Itmpencilhb",pencil.getBrand());
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        stationary pen = new stationary.Builder("Itmpen").descrip("writeInk").brand("penflex").Build();
        Assert.assertEquals(pen.getBarcode(),"Itmpen",pen.getBrand());
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