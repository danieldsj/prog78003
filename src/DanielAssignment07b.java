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
        
        /*
//      long invalidCardNumber = 4388576018402626L;
        long validCardNumber = 4388576018410707L;
        
        generateOutput(validCardNumber, isValid(validCardNumber));
        generateOutput(invalidCardNumber, isValid(invalidCardNumber));
        */
        
        /*
        System.out.println(getDigit(33));
        System.out.println(getDigit(2));
        
        System.out.println(getSize(1));
        System.out.println(getSize(11));
        System.out.println(getSize(111));
        
        System.out.println(getPrefix(12345, 3));
        System.out.println(getPrefix(54321, 2));
        
        System.out.println(prefixMatched(1234, 123));
        System.out.println(prefixMatched(1234, 321));
        */
    }
    
    /* Generate the desired output. Do not return any value. */
    public static void generateOutput(long cardNumber, boolean valid) {
        if(valid) {
            System.out.printf("%d is valid\n", cardNumber);
        }
        else {
            System.out.printf("%d is not valid\n", cardNumber);
        }   
    }
    
    /* Get the user input and return a long value. */
    public static long getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        return input.nextLong();
    }
    
    /* Given a long value, return true is the value is a valid credit card 
    number */
    public static boolean isValid(long cardNumber) {
        int evenSum = sumOfDoubleEvenPlace(cardNumber);
        int oddSum = sumOfOddPlace(cardNumber);
        int result = evenSum + oddSum;
        
        if(result % 10 == 0){
            return true;
        }
       
        return false;
    }
    
    /* Given a long number, return the sum of the doubled even placed numbers 
    from right to left. If the doubled number has two digits, use the sum of the
    digits. */
    public static int sumOfDoubleEvenPlace(long cardNumber) {
                
        // The "total" variable will be returned.
        int total = 0;
        
        // Convert the long into a string to be able to use positions.
        String cardString = String.valueOf(cardNumber);
        
        // Iterate over the numbers from right to left.
        for(int i = cardString.length() - 1; i > -1; i --){
            
            // When the position is even.
            if(i % 2 == 0){
                
                // Get the integer value of the character.
                char valueChar = cardString.charAt(i);
                String valueString = Character.toString(valueChar);
                
                // Multiply by 2 to double the value.
                int value = Integer.parseInt(valueString) * 2;
                
                // Use the getDigit function to get the sum of the digits.
                total += getDigit(value);
            }
        }
        return total;
    }
    
    /* Given an int number, return this number if it is a single digit, 
    otherwise return the sum of the two digits. */
    public static int getDigit(int number) {
        if(number > 9){
            return ((int)(number/10) % 10) + ((int)(number % 10));
        }
        else {
            return number;
        }
        
    }
    
    /* Given a long, return the sum of the odd placed digits from right to 
    left. */
    public static int sumOfOddPlace(long cardNumber) {
        int total = 0;
        
        // Convert the long into a string to be able to use positions.
        String cardString = String.valueOf(cardNumber);
        
        // Iterate over the numbers from right to left.
        for(int i = cardString.length() - 1; i > -1; i --){
            
            // If the position is odd.
            if(i % 2 == 1){
                
                // Get the integer value of the character.
                char valueChar = cardString.charAt(i);
                String valueString = Character.toString(valueChar);
                int value = Integer.parseInt(valueString);
                
                // Add the value to the total.
                total += value;
                
            }
            
        }
        
        return total;
    }
    
    /* Given a long and an int, return true if the int is a prefix for the 
    long. */
    public static boolean prefixMatched(long cardNumber, int d) {
        
        int prefixSize = getSize(d);
        long prefixValue = getPrefix(cardNumber, prefixSize);
        
        if(prefixValue == d){
            return true;
        } else {
            return false;
        }
    }
    
    /* Given an int, return the number of digits. */
    public static int getSize(int d) {
        int value = d;
        int digits = 0;
        
        while(value > 0){
            value = value / 10;
            digits++;
        }
        
        return digits;
    }
    
    /* Given a long and int, return the first int numbers of digits from the 
    long.*/
    public static long getPrefix(long cardNumber, int k) {
        double size = getSize((int)cardNumber);
        double digits = (double)cardNumber / 
                Math.pow(10.0, (double)getSize((int)cardNumber) - k);
       
        return (long)digits;
    }
}
