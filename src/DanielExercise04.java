/*

Written by: Daniel de Sao Jose

Requirements:
* Write a program that sums any digits entered as a string from the console.

*/

import java.util.Scanner;

public class DanielExercise04 {
    public static void main(String[] args) {
        
        // Instantiate the refernce variable for the Scanner class.
        Scanner input = new Scanner(System.in);
        
        // Get the string from the user.
        System.out.print("Enter a string of numbers: ");
        String text = input.nextLine();
       
        // Create the sum variable
        int sum = 0;
        
        // Iterate over each character.
        for(int index=0; index < text.length(); index++){
            sum += Integer.parseInt(String.valueOf(text.charAt(index)));
        }
        
        // Generate output.
        System.out.println(sum);        
        
    }
    
}
