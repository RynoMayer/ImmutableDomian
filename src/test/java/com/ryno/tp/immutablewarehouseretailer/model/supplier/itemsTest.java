/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.supplier;

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
public class itemsTest {
    
    public itemsTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testCreation(){
        
        items ItemA = new items.Builder("ItmGlass").descrip("glass").build();
        Assert.assertEquals(ItemA.getBarcode(),"ItmGlass",ItemA.getDescrip());
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        items ItemB = new items.Builder("ItmAshtray").descrip("Ashtray").build();
        Assert.assertEquals(ItemB.getBarcode(),"ItmAshtray",ItemB.getDescrip());
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