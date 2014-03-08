/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.productTest;

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
public class ElectronicsTest {
    
    public ElectronicsTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation(){
        
        Electronics ItemA = new Electronics.Builder("Itm321").descrip("Radio").brand("pioneer").Build();
        Assert.assertEquals(ItemA.getBarcode(),"Itm321",ItemA.getDescrip());
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Electronics ItemB = new Electronics.Builder("Itm987").descrip("TV").brand("panasonic").Build();
        Assert.assertEquals(ItemB.getBrand(),"panasonic");
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