/*

Written by: Daniel de Sao Jose

Requierments:
* Prints the characters in the ASCII character table from ! to ~ .
* Display ten characters per line.
* Characters are separated by exactly one space.

 */
public class DanielExercise03 {
    public static void main(String[] args) {
        
        // Create a character to count the columns.
        int col = 0;
        
        for(int c = (int)'!'; c <= (int)'~'; c++) {
            
            // Print the character with a leading space.
            System.out.printf("%2s", (char)c); 
            
            // Increment the column value.
            col++;
            
            if (col > 9) {
                // Reset the colulmn variable to 0 when we reach the end.
                col = 0; 
                // Print a new line.
                System.out.println();
            }
        }
        
        // New line at the end.
        System.out.println();
    }
}
