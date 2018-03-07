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
public class DanielAssignment02bTest {
    
    public DanielAssignment02bTest() {
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
     * Test of main method, of class DanielAssignment02b.
     */
    @Test
    public void testMain() {
        if (DanielAssignment02b.minutesToYears(1000000000) != 1902) {
            fail("1000000000 minutes should be 1902 years.");
        }
        
        if (DanielAssignment02b.minutesToDays(1000000000) != 214) {
            fail("1000000000 minutes should be 214 days (into a year).");
        }

    }
    
}
