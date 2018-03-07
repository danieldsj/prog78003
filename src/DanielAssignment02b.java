/*

Written by: Daniel de Sao Jose

Assignment:

Write a program that prompts the user to enter the minutes (e.g. 1 billion),
and displays the number of years and days for the minutes. For simplicity,
assume a year has 365 days.

*/

import java.util.Scanner;

public class DanielAssignment02b {
    public static void main(String[] args) {
        
        // Variables!
        int minutes;
        int years;
        int days;
        
        // Reference variables!
        Scanner input = new Scanner(System.in);
        
        // Input!
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextInt();
        
        // Calculations!
        // 60 minutes x 24 hours x 365 days = 525600 minutes per year
        years = minutesToYears(minutes);
        
        // 60 minutes x 24 hours = 1440 minutes per day
        days = minutesToDays(minutes);
        
        System.out.println(minutes + " minutes is approximately " + years + 
                           " years and " + days + " days.");
        
    }
    
    public static int minutesToYears(int minutes) {
        // 60 minutes x 24 hours x 365 days = 525600 minutes per year
        // Written as method for unit tests.
        // See: https://github.com/danieldsj/prog78003/tree/master/test
        return minutes / 525600;
    }
    
    public static int minutesToDays(int minutes) {
        // 60 minutes x 24 hours = 1440 minutes per day
        // Written as method for unit tests.
        // See: https://github.com/danieldsj/prog78003/tree/master/test
        return (minutes % 525600) / 1440;
    }
}