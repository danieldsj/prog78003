/*

Written by: Daniel de Sao Jose

Assignment:
* Create a java class.
* The java class must have a method called "print" that takes one argument.
* The java class must have a method called "myMax".
* The "myMax" method must have a return type.
* The "myMax" method must take two doubles as Arguments.
* The "myMax" must use the Math.max() method.

*/

import java.util.Scanner;

public class DanielAssignment06 {
    public static void main(String[] args) {
        
        // Create a reference variable for the Scanner class.
        Scanner input = new Scanner(System.in);
        
        // Prompt for two int values.
        System.out.print("Enter the first int: ");
        int value1 = input.nextInt();
        System.out.print("Enter the second int: ");
        int value2 = input.nextInt();
        
        // Print maximum using class methods.
        System.out.printf("The maximum of %d and %d is: ", value1, value2);
        print(myMax(value1, value2));
        
        // Spacer.
        System.out.println();
        
        // Prompt for two double values.
        System.out.print("Enter the first double: ");
        double valueOne = input.nextDouble();
        System.out.print("Enter the second double: ");
        double valueTwo = input.nextDouble();
        
        // Print maximum using class methods.
        System.out.printf("The maximum of %f and %f is ", valueOne, valueTwo);
        print(myMax(valueOne, valueTwo));
    }
    

    public static int myMax(int x, int y) {
        // Returns the maximum of the two ints as an int.
        return Math.max(x, y);
    }
    
    public static double myMax(double x, double y) {
        // Same as above, overloaded for double.
        return Math.max(x, y);
    }
    
    public static void print(int number) {
        // Prints the integer. Used println cause it looks nicer.
        System.out.println(number);
    }
    
    public static void print(double number) {
        // Same as above overloaded for doubles.
        System.out.println(number);
    }
    
}
