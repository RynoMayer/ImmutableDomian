/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.productTest;

import com.ryno.tp.immutablewarehouseretailer.model.product.Item;
import com.ryno.tp.immutablewarehouseretailer.model.product.sportware;
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
public class sportwareTest {
    
    public sportwareTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testCreation(){
        
        sportware ItemA = new sportware.Builder("ItmOlyRun").descrip("shoe").brand("olypics").Build();
        Assert.assertEquals(ItemA.getBarcode(),"ItmOlyRun",ItemA.getDescrip());
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        sportware ItemB = new sportware.Builder("ItmAddRuns").descrip("trainer").brand("addidas").Build();
        Assert.assertEquals(ItemB.getBarcode(),"ItmOlyRuns",ItemB.getDescrip());
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