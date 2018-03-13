/*

Written by: Daniel de Sao Jose

Assignment:
* Based on exercise 3.19.
* Given the size of three edges of a triangle.
* Determine whether the sum of every pair of edges is greater than the 
remaining edge.

 */

import java.util.Scanner;

public class DanielAssignment03Part2 {

    public static void main(String[] args) {

        // Create object using Scanner class.
        Scanner input = new Scanner(System.in);

        // Declare variables.
        double edge1;
        double edge2;
        double edge3;

        // Get the edges.
        System.out.print("Enter three edges: ");
        edge1 = input.nextDouble();
        edge2 = input.nextDouble();
        edge3 = input.nextDouble();

        // Validate that the edges provided are valid.
        if (isTriangleValid(edge1, edge2, edge3) == true) {
            System.out.println("Valid edge sizes.");

        } else {
            System.out.println("Invalid edge sizes.");
        }

    }

    public static boolean isTriangleValid(double edge1, double edge2, double edge3) {
        // Determine whether the triangle is valid.

        if ((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2)
                && (edge2 + edge3) > edge1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static double getPerimeter(double edge1, double edge2, double edge3) {
        // Given three edges return a perimeter.
        return edge1 + edge2 + edge3;
    }

}
