/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class DanielAssignment03Test {
    
    public DanielAssignment03Test() {
    }

    /**
     * Test of main method, of class DanielAssignment03.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        //DanielAssignment03.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of twoDecimals method, of class DanielAssignment03.
     */
    @Test
    public void testTwoDecimals() {
        System.out.println("twoDecimals");
        double number = 1.2345678;
        double expResult = 1.23;
        double result = DanielAssignment03.twoDecimals(number);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
