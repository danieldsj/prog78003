/*
 * 
 * Written by: Daniel de Sao Jose
 * 
 * Requirements:
 *  Implement tic-tac-toe game.
 *
 */

import java.util.Scanner;

public class DanielAssignment10 {
    
    /* 
    The main function.
    */
    public static void main(String[] args) {
       
        int[][] array = new int[3][3]; // The tic-tac-toe grid.
        int currentPlayer = 1; // Player 1 = X, player 2 = O.
        int winningPlayer = 0; // Sentinal variable for loop if not zero.
         
        while(winningPlayer == 0) {
            
            // Render the grid using the array.
            render(array);
            
            // Prompt the current player for coordinates.
            int selectedRow = promptRow(currentPlayer);
            int selectedCol = promptCol(currentPlayer);
            
            // Check to see if the coordinates already have a value.
            if(array[selectedRow][selectedCol] == 0){
                
                // Update the coordinates with the player value.
                array[selectedRow][selectedCol] = currentPlayer;
                
                // Check to see if anyone won.
                winningPlayer = getWinner(array);
                if(!(winningPlayer == 0)){
                    System.out.println("Winning player is " + 
                        numberToCharacter(currentPlayer) + ".");
                    System.exit(0);
                }
                // Alternate the player numbers.
                if(currentPlayer == 1){
                       currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
                
            } else {
                
                // If coordinates already used, loop again without changing the
                // player.
                System.out.println("Those coordinates already used.");
            } 
        }
    }
    
    /*
    Converts an integer into a character for the purpose of rendering a 
    tic-tac-toe grid.
    
    Given the number 0, return whitespace.
    Given the number 1, return an X character.
    Given the number 2, return an O character.
    */
    public static char numberToCharacter(int number) {
        if(number == 1){
            return 'X';
        } else if(number == 2) {
            return 'O';
        }
        return ' ';
    }
    
    /*
    Renders a tic-tac-toe grid.
    Given an array of integers, render a tic-tac-toe grid using dashes, pipes,
    X, O, and white space characters.
    */
    public static void render(int[][] array) {
        
        // Iterate over the rows.
        for(int row = 0; row < array.length; row++){
            System.out.println("-------------"); // Dashes above every row.
            System.out.print("|"); // Pipes before every row.
            
            // Iterate over the columns.
            for(int col = 0; col < array[row].length; col++){
                System.out.printf(" %c |", numberToCharacter(array[row][col]));
            }
            System.out.println(""); // New line.
        }
        // Print the bottom line.
        System.out.println("-------------");
        
    }
    
    /* 
    Prompt player for row, return int.
    */
    public static int promptRow(int player){
        Scanner input = new Scanner(System.in);
        int result;
        
        do {
        System.out.printf("Enter a row (0, 1, or 2) for player %c: ", 
                numberToCharacter(player)); 
        result = input.nextInt();        
        } while(result < 0 || result > 2);
        
        return result;
    }

    /*
    Prompt player for column, return int.
    */
    public static int promptCol(int player){
        Scanner input = new Scanner(System.in);
        int result;
        
        do {
        System.out.printf("Enter a column (0, 1, or 2) for player %c: ", 
                numberToCharacter(player)); 
        result = input.nextInt();        
        } while(result < 0 || result > 2);
        
        return result;
    }
    
    /* 
    Given an array, determine whether there is a winner.
    */
    public static int getWinner(int[][] array){
        // check upper-left to lower-right.
        if(array[0][0] == array[1][1] && array[0][0] == array[2][2] 
                && !(array[0][0] == 0)){
            return array[0][0];
        } 
        
        // check upper-right to lower-left.
        if(array[0][2] == array[1][1] && array[0][2] == array[2][0]
                && !(array[0][2] == 0)){
            return array[0][2];
        }
        
        // For each column.
        for(int column = 0; column < array[0].length; column++) {
            
            // If all of the rows are the same value as in row zero.
            if(array[0][column] == array[1][column] && 
                    array[0][column] == array[2][column] 
                    && !(array[0][column] == 0)){
                
                // Return the value of row zero.
                return array[0][0];
            }
        }
        
                // For each row.
        for(int row = 0; row < array[0].length; row++) {
            
            // If all of the columns are the same value as in column zero.
            if(array[row][0] == array[row][1] && 
                    array[row][0] == array[row][2] && !(array[row][0] == 0)){
                
                // Return the value of column zero.
                return array[0][0];
            }
        }
        
        return 0;
        
    }
    
}
