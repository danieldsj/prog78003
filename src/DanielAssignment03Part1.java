/*

Written by: Daniel de Sao Jose

Assignment:
* Based on exercise 3.5.
* Given an integer representing the day of the week (sunday=0, saturday=6).
* Given an integer representing the number of days in the future.
* Return the future day of the week.
* Prompt for today's date must look like "Enter today's day: 
* Prompt for number of days must look like:
    "Enter the number of days elapsed since today: "
* Output must look like:
    "Today is Monday and the future day is Thursday"

Unit tests:
* 0 as day of the week, 31 as number of days, returns Wednesday.
* 1 as day of the week, 3 as number of days, returns Thursday.

*/

import java.util.Scanner;

public class DanielAssignment03Part1{
    
    public static void main(String[] args){
        
        // Create an object from the Scanner class.
        Scanner input = new Scanner(System.in);
        
        // Get today's day.
        System.out.print("Enter today's day: ");
        int todayDayNumber = input.nextInt();
        
        // Get the number of days.
        System.out.print("Enter the number of days elapsed since today: ");
        int numberOfDays = input.nextInt();
        
        // Use the getFutureDayOftheWeek method to get futureDayNumber.
        int futureDayNumber = getFutureDayOfTheWeek(todayDayNumber, 
                numberOfDays);
        
        // Get the strings.
        String todayDayString = getDayOfTheWeekString(todayDayNumber);
        String futureDayString = getDayOfTheWeekString(futureDayNumber);
                
        // Generate the expected output.
        System.out.println("Today is " + 
                todayDayString + 
                " and the future day is " + 
                futureDayString);
        
    }
    
    public static int getFutureDayOfTheWeek(int dayOfTheWeekNumber, int numberOfDays) {
        // Method return the future day of the week.
        return (numberOfDays % 7) + dayOfTheWeekNumber; 
    }
    
    public static String getDayOfTheWeekString(int dayOfTheWeekNumber) {
        // Method to translate a number to a name.
        switch(dayOfTheWeekNumber) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "";
        }
        
    }
}