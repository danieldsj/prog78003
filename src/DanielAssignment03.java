/*

Written by: Daniel de Sao Jose

Requirements:
* Prompt for a name and accept a string.
* Prompt for s number of hours and accept an integer.
* Prompt for a hourly pay and accept a float.
* Prompt for a federal tax withholding and accept an integer.
* Prompt for a state tax withholding and accept an integer.
* Return the Employee name.
* Return the number of hours worked as an float to the nearest 1 decimal.
* Return the hourly pay rate as a float to the nearest 2 decimal.
* Return the gross pay as a float to the nearest 1 decimal.
* Return the Federal Tax Withholding rate as a percentage float to the 
  nearest 1 decimal.
* Return the Federal Tax Withholding as a dollar value float to the 
  nearest 1 decimal.
* Return the State Tax Withholding rate as a percentage float to the 
  nearest 2 decimal.
* Return the total deduction as a dollar value float to the nearest 2 decimals.
* Return the net pay as a dollar value float to the nearest 2 decimals.

*/

import java.util.Scanner;

public class DanielAssignment03 {
    public static void main(String[] args) {
        
        // Create instance of the Scanner class.
        Scanner input = new Scanner(System.in);
        
        // Prompt and create the instance variables.
        System.out.print("Enter employee's name: ");
        String employeeName = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double numberOfHours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();
        
        // Calculate output.
        double grossPay = numberOfHours * hourlyPayRate;
        double federalTaxDeduction = grossPay * federalTaxRate;
        double stateTaxDeduction = grossPay * stateTaxRate;
        double totalDeductions = federalTaxDeduction + stateTaxDeduction;
        double netPay = grossPay - totalDeductions;
        
        // General output.
        System.out.println();
        System.out.printf("Employee name: %s\n", employeeName);
        System.out.printf("Hours worked: %.1f\n", numberOfHours);
        System.out.printf("Pay rate: $%.2f\n", hourlyPayRate);
        System.out.printf("Gross pay: $%.1f\n", grossPay);
        System.out.printf("Deductions:\n");
        System.out.printf("  Federal withholding (%.1f%%): $%.1f\n",
                federalTaxRate * 100, federalTaxDeduction);
        System.out.printf("  State withholding (%.1f%%): $%.2f\n",
                stateTaxRate * 100, twoDecimals(stateTaxDeduction));
        System.out.printf("  Total Deduction: $%.2f\n", 
                twoDecimals(totalDeductions));
        System.out.printf("Net Pay: $%.2f\n", 
                twoDecimals(netPay));
    }
    
    public static double twoDecimals(double number) {
        return (int)(number * 100) / 100.0;
    }
    
}
