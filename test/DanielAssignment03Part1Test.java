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
public class DanielAssignment03Part1Test {
    
    public DanielAssignment03Part1Test() {
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
     * Test of main method, of class DanielAssignment03Part1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DanielAssignment03Part1 instance = new DanielAssignment03Part1();
       
        // DanielAssignment03Part1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getDayOfTheWeekString method, of class DanielAssignment03Part1.
     */
    @Test
    public void testGetDayOfTheWeekString() {
        System.out.println("getDayOfTheWeekString");
        DanielAssignment03Part1 instance = new DanielAssignment03Part1();

        assertEquals("Sunday", instance.getDayOfTheWeekString(0)); 
        assertEquals("Monday", instance.getDayOfTheWeekString(1));
        assertEquals("Tuesday", instance.getDayOfTheWeekString(2));
        assertEquals("Wednesday", instance.getDayOfTheWeekString(3));
        assertEquals("Thursday", instance.getDayOfTheWeekString(4));
        assertEquals("Friday", instance.getDayOfTheWeekString(5));
        assertEquals("Saturday", instance.getDayOfTheWeekString(6));
        assertEquals("", instance.getDayOfTheWeekString(8));
    }
    
    @Test
    public void testGetFutureDayOfTheWeek() {
        System.out.println("getFutureDayOfTheWeek");
        DanielAssignment03Part1 instance = new DanielAssignment03Part1();
        
        assertEquals(3, instance.getFutureDayOfTheWeek(0, 31));
        assertEquals(4, instance.getFutureDayOfTheWeek(1, 3));

    }
    
}
