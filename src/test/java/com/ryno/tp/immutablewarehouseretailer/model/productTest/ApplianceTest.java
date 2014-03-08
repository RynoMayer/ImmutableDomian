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
        
        Appliance ItemA = new Appliance.Builder("Itm8512").descrip("microwave").brand("amg").Build();
        Assert.assertEquals(ItemA.getBarcode(),"Itm8512",ItemA.getDescrip());
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Appliance ItemB = new Appliance.Builder("Itm741").descrip("Toaster").brand("kelvin").Build();
        Assert.assertEquals(ItemB.getBrand(),"kelvin");
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