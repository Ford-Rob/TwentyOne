/*
 * This will hold the Player information for the game. 
 * 
 * 10/12 Tried to use this class to complete Week 3 individual assignment and 
 * add multiple players. Maybe I have a foundation, but it is currently beyond 
 * to get it to work.
 * 
 * 10/14 See MainMenu class. I was able to move all of the Player code from the 
 * TwentyOne class to here. Making progress on adding multiple players. 
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
    private String[] playerName = new String[0];
    int numberofPlayers = 0; 
    int kbdInput;
    String stringInput;
    static Scanner input = new Scanner(System.in);
    String nameInput;
        
        
    public void getName() {
        for (int i=0; i < playerName.length; i++){        
            System.out.println("\nEnter your name: ");
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
}

