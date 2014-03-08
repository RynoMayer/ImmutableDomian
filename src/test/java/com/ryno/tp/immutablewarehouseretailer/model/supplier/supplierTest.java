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
public class supplierTest {
    
    public supplierTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation(){
        
        supplier supp1 = new supplier.Builder("Coca-Cola","softdrink").build();
        Assert.assertEquals(supp1.getCompany(),"Coca-Cola");
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        supplier supp2 = new supplier.Builder("samsung","Electronics").build();
        Assert.assertEquals(supp2.getCompany(),"samsung");
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