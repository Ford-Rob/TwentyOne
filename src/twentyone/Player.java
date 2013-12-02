/* 
 * 
 * Assigned to WMitchell.
 */
package twentyone;

import java.util.Scanner;

/**
 * @author WMitchell
 * @author RFord
 */
public class Player {
    static String[] playerName = new String[0];
    public int numberofPlayers = 0; 
    int kbdInput;
    String stringInput;
    static Scanner input = new Scanner(System.in);
    static String nameInput;
        
        
    public void getName() {
        for (int i=0; i < playerName.length; i++){ 
            int pnum =i+1;
            System.out.println("\nPlayer " + pnum + " Enter your name: ");
            nameInput = Player.input.next();
            playerName[i] = nameInput;
            System.out.println("\nWelcome " + playerName[i] + "\n");
        }
    }           

    public void multiPlayer() {
        while(numberofPlayers == 0) {
            
            System.out.println("\nNumber of Players (1 or 2): ");
            stringInput = Player.input.next();
            try {
                kbdInput = Integer.parseInt(stringInput);                
            } catch(NumberFormatException e) {
                kbdInput = 0;
            }

            if (kbdInput == 1){
                numberofPlayers = 1;
                playerName = new String[1];
                continue;
            } else if (kbdInput == 2){
                numberofPlayers = 2;
                playerName = new String[2];
                continue;
            } else System.out.println("Please enter a 1 or a 2");
        }
    
    }
    //needs an integer 1 or 2
    public String currentPlayer(int current) {
        return playerName[current];
        
    }
}

