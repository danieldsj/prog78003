/*

Written by: Daniel de Sao Jose
 
Requirements:
* Create a program that
* Using Arrays and Methods,
* In the main method - 
1) Requests the input from the console the number of elements you would like to 
fill an array with - this will become the size of the array.
2) Requests a second input of an even numbers from the console - e.g. you enter 
the number 120.
3) Invoke the methods as follows:

Create two methods to do the following
1) One method will contain a loop to fill the array with even numbers from the 
even number entered - you fill the array with 120, 122, 124..... until the 
array is full (size of array)
4) A second method to print to the console the numbers of your array.  The 
output should be the even numbers from the even number entered.

*/

import java.util.Scanner;

public class DanielAssignment08 {
    
    public static void main(String[] args){
        
        // Create the reference variable for the referenc class.
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the arraySize value.
        System.out.print("How many elements: ");
        int arraySize = input.nextInt();
        
        // Prompt the user until an even number is provided.
        int startingNumber = 0;
        do {
            System.out.print("Enter the starting even number: "); 
            startingNumber = input.nextInt();
        } while((startingNumber % 2) == 1);
        
        int[] array = arrayFill(arraySize, startingNumber);
        generateOutput(array);
        
    }
   
    /* 
    Given an arraySize and a startingNumber value, return an array where
    element zero of the array is startingNumber and the remaining elements are
    the even numbers succeeding the startingNumber.
    */
    public static int[] arrayFill(int arraySize, int startingNumber){
        int[] array = new int[arraySize];
        
        array[0] = startingNumber;
        for(int i = 1; i < array.length; i++){
            array[i] = array[i - 1] + 2;
        }
        return array;
    }
    
    /*
    Given an single dimensional array, display the array to standard out.
    */
    public static void generateOutput(int[] array) {
        for(int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }
}
