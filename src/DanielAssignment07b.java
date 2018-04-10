/*

Written by: Daniel de Sao Jose

Requirements:
* Prompts the user to enter a credit card number as a long integer. 
* Display whether the number is valid or invalid.
* Class must have a method called isValid method that accepts a long value and 
  returns a boolean.
* Class must have a sumOfDoubleEvenPlace method that accepts a long value and 
  returns an int.
* Class must have a getDigit method that accepts an int and returns an int.
* Class must have a sumOfOddPlace method that accepts a long and returns and 
  int.
* Class must have a prefixMatched method that accepts a long and an int and 
  returns a boolean.
* Class must have a getSize method that accepts a long and returns an int.
* Class must have a getPrefix method that accepts a long and int and returns a 
  long.
* Must have a prompt that says "Enter a credit card number as a long integer:".
* Must have a response that says "<number> is valid".

*/

import java.util.Scanner;

public class DanielAssignment07b {
    public static void main(String[] args) {
        
        long cardNumber = getInput();
        generateOutput(cardNumber, isValid(cardNumber));
        
    }
    
    public static void generateOutput(long cardNumber, boolean valid) {
        if(valid) {
            System.out.printf("%d is valid\n", cardNumber);
        }
        else {
            System.out.printf("%d is not valid\n", cardNumber);
        }   
    }
    
    public static long getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        return input.nextLong();
    }
    
    /** Return true if the card number is valid. **/
    public static boolean isValid(long cardNumber) {
        return true;
    }
    
    /** Get the result from step 2. **/
    public static int sumOfDoubleEvenPlace(long cardNumber) {
        return 0;
    }
    
    /** getDigit.
     * Return this number if it is a single digit, otherwise return the sum of 
     * the two digits. 
     
     @param number - something.
     @return int - something. 
     **/
    public static int getDigit(int number) {
        return 0;
    }
    
    /** Return the sum of the odd placed digits. **/
    public static int subOfOddPlace(long number) {
        return 0;
    }
    
    /** Return true if the digit d is a prefix for a number. **/
    public static boolean prefixMatched(long cardNumber, int d) {
        return true;
    }
    
    /** Return the number of digits in d. **/
    public static int getSize(int d) {
        return 0;
    }
    
    /** Return the first k number of digits from number. If the number of 
     * digits in number is less than k, return number. */
    public static long getPrefix(long cardNumber, int k) {
        return 0;
    }
    
}
