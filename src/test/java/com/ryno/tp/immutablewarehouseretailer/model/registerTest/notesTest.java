/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ryno.tp.immutablewarehouseretailer.model.registerTest;

import com.ryno.tp.immutablewarehouseretailer.model.till.Coins;
import com.ryno.tp.immutablewarehouseretailer.model.till.notes;
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
public class notesTest {
    
    public notesTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testCreation(){
        
        notes noteA = new notes.Builder("R",200).build();
        Assert.assertEquals(noteA.getValue(),200);
        
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        notes noteB = new notes.Builder("R",50).build();
        Assert.assertEquals(noteB.getAbbv(),"R");
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