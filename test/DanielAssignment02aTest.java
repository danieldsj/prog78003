/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class DanielAssignment02aTest {
    
    public DanielAssignment02aTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class DanielAssignment02a.
     */
    @Test
    public void testMain() {
        
        if (DanielAssignment02a.getGratuity(10, 15) != 1.5) {
            fail("15% of 10 should be 1.5");
        }
        
        if (DanielAssignment02a.getTotal(10, 1.5) != 11.5) {
            fail("10 + 1.5 should be 11.5");
        }
    }
    
}
