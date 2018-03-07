/*

Written by: Daniel de Sao Jose

Assignment:

Write a program that reads the subTotal and the gratuityRate rate, then computes
the gratuityRate and total. For example, if the user enters 10 for subTotal and
15% for gratuityRate rate, the program displays $1.5 as gratuityRate and $11.5 as
the total.

*/

import java.util.Scanner;

public class DanielAssignment02a {
    public static void main(String[] args) {
        
        // Variables!
        double subTotal;
        double gratuityRate;
        double gratuity;
        double total;
        
        // Reference variables!
        Scanner input = new Scanner(System.in);
        
        // Input!
        System.out.print("Enter subtotal and gratuity rate: ");
        subTotal = input.nextDouble();
        gratuityRate = input.nextDouble();
        
        // Calculations!
        gratuity = getGratuity(subTotal, gratuityRate);
        total = getTotal(subTotal, gratuity);
        
        // Output!
        System.out.println("The gratuity is $" + gratuity + " and the total " + 
                           "is $" + total + ".");
        
    }
    
    public static double getGratuity(double subTotal, double gratuityRate) {
        // Wrote these as methods to help with unit testing.
        // See: https://github.com/danieldsj/prog78003/tree/master/test
        return (subTotal * (gratuityRate / 100));
    }
    
    public static double getTotal(double subTotal, double gratuity) {
        // Wrote these as methods to help with unit testing.
        // See: https://github.com/danieldsj/prog78003/tree/master/test
        return subTotal + gratuity;
    }
}