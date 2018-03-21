/*

Written by: Daniel de Sao Jose

Requirements:
* Display numbers in a pyramid pattern.
* Based on exercise 5.19 from the textbook.

 */
public class DanielAssignment05 {
    
    public static void main(String[] args) {
        
        for(int index = 0; index < 8; index++) {
            System.out.println((int)Math.pow(2, index));
        }
        
    }
    
}
