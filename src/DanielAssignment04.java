/*

Written by: Daniel de Sao Jose

Requirements:
* Must use a for loop.
* Must use the String class and it's methods.
* Must take input from the console string.

 */

import java.util.Scanner;

public class DanielAssignment04 {
    
    public static void main(String[] args) {
        // Create the input reference object with the Scanner class.
        Scanner input = new Scanner(System.in);

        // Prompt the user for a string value and store it in a variable.
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        for(int index = 0; index < text.length(); index++) {
            System.out.println(text.charAt(index));
        }
        
    }
    
}
