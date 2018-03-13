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
public class DanielAssignment03Part2Test {
    
    public DanielAssignment03Part2Test() {
    }

    /**
     * Test of main method, of class DanielAssignment03Part2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        // DanielAssignment03Part2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of isTriangleValid method, of class DanielAssignment03Part2.
     */
    @Test
    public void testIsTriangleValid() {
        System.out.println("isTriangleValid");
        assertEquals(true, DanielAssignment03Part2.isTriangleValid(26, 21, 17));
        assertEquals(true, DanielAssignment03Part2.isTriangleValid(1, 1, 1));
        assertEquals(false, DanielAssignment03Part2.isTriangleValid(1, 1, 3));
        assertEquals(false, DanielAssignment03Part2.isTriangleValid(1, 3, 1));
        assertEquals(false, DanielAssignment03Part2.isTriangleValid(3, 1, 1));
    }

    /**
     * Test of getPerimeter method, of class DanielAssignment03Part2.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        double edge1 = 0.0;
        double edge2 = 0.0;
        double edge3 = 0.0;
        double expResult = 0.0;
        double result = DanielAssignment03Part2.getPerimeter(edge1, edge2, edge3);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
