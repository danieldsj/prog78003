/*

Written by: Daniel de Sao Jose

Requirements:
* Display numbers in a pyramid pattern.
* Based on exercise 5.19 from the textbook.

 */
public class DanielAssignment05 {
    
    public static void main(String[] args) {
        
        // Maximum width is 15 integers with a fixed width of 4 characters.
        // Each row is a balance of white space
        
        for(int row = 8; row > 0; row--){
            
            // Print the whitespace preceding the number(s).
            // The number of spaces is a function of the row number.
            // number of spaces = maximum white space - row number.
            for(int column = 0; column < row - 1; column++) {
                System.out.print("    ");
            }
            
            // Print the descending numbers with a fixed width.
            // The range of numbers is a function of the row number.
            // number = 2 ^ 0...maximum row
            for(int power = 0; power < (9 - row); power++){
                System.out.printf("%4d", (int)Math.pow(2, power));
            }
            
            // Print the asending numbers with a fixed with.
            // The range of numbers is a function of the row number.
            // number = 2 ^ 7 - row...0
            for(int power = (7 - row); power >= 0; power--) {
                System.out.printf("%4d", (int)Math.pow(2, power));
            }
            
            // A repeat the same whitespace loop as above.
            // This is not necessary, but is more explicit.
            for(int column = 0; column < row - 1; column++ ) {
                System.out.print("    ");
            }
            
            // Terminate the line every row.
            System.out.println();
        }
        
    }
    
}
