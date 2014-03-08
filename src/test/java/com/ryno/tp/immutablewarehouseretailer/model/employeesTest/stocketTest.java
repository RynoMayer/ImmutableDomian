/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.employeesTest;

import com.ryno.tp.immutablewarehouseretailer.model.employees.Stocker;
import com.ryno.tp.immutablewarehouseretailer.model.employees.cashier;
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
public class stocketTest {
    
    public stocketTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation(){
        
        Stocker stocker1 = new Stocker.Builder("Tom","cash770", 1000).Build();
        Assert.assertEquals(stocker1.getEmpNum(),"cash770");
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Stocker stocker2 = new Stocker.Builder("Andy", "cash088", 1100).Build();
        Assert.assertEquals(stocker2.getEmpNum(),"cash088");
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