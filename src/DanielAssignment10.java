/**
 * 
 * Written by: Daniel de Sao Jose
 * 
 * Requirements:
 *  Implement tic-tac-toe game.
 *  Two players: X and O.
 *
 */

import java.util.Scanner;

public class DanielAssignment10 {
    
    /* 
    The main function.
    */
    public static void main(String[] args) {
        
        /*
        int[][] testArray = new int[3][3];
        testArray = {{1,1,1},{0,0,0},{0,0,0}};
        getWinner(new {{1,1,1},{0,0,0},{0,0,0}})
        */
        
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
                
                winningPlayer = getWinner(array);
                System.out.println("Winning player is " + 
                        numberToCharacter(winningPlayer) + ".");
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
    
    public static int getWinner(int[][] array){
        
        // Assume no winner.
        int winner = 0;
        
        //check rows
        for(int row = 0; row < array.length; row++) {           
            for(int col = 0; col < array[row].length; col++) {
                if(array[row][0] == array[row][col]){
                    winner = array[row][0];
                } else {
                    winner = 0;
                    continue;
                }
            }
            if(!(winner == 0)){
                break;
            } else {
                continue;
            }
        }
        
        // check columns.
        for(int col = 0; col < array.length; col++) {
            for(int row = 0; col < array[row].length; col++) {
                if(array[0][col] == array[row][col]){
                    winner = array[0][col];
                } else {
                    winner = 0;
                    continue;
                }
            }
            if(!(winner == 0)){
                break;
            } else {
                continue;
            }
        }
        
        // check upper-left to lower-right.
        for(int i = 0; i < array.length; i++){
            if(array[0][0] == array[i][i]){
                winner = array[0][0];
            } else {
                winner = 0;
                break;
            }
        }
        
        // check upper-right to lower-left.
        // TODO
        
        return winner;
    }
    
}
