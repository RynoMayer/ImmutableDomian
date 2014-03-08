/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.productTest;

import com.ryno.tp.immutablewarehouseretailer.model.product.Appliance;
import com.ryno.tp.immutablewarehouseretailer.model.product.Electronics;
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
public class ApplianceTest {
    
    public ApplianceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation(){
        
        Appliance ItemA = new Appliance.Builder("ITMhammer").descrip("flathead").brand("stahl").Build();
        Assert.assertEquals(ItemA.getBarcode(),"ITMhammer",ItemA.getDescrip());
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Appliance ItemB = new Appliance.Builder("ItmNail").descrip("longNail").brand("generic").Build();
        Assert.assertEquals(ItemB.getBarcode(),"ItmNail",ItemB.getDescrip());
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