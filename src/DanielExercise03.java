/*

Written by: Daniel de Sao Jose

Requierments:
* Prints the characters in the ASCII character table from ! to ~ .
* Display ten characters per line.
* Characters are separated by exactly one space.


 */
public class DanielExercise03 {
    public static void main(String[] args) {
        int col = 0;
        
        for(int c = (int)'!'; c <= (int)'~'; c++) {
            System.out.printf("%2s", (char)c);
            col++;
            if (col > 9) {
                col = 0;
                System.out.println();
            }
        }
        
        System.out.println();
    }
}
