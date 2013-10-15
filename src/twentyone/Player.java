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
    static String playerName;
    int numberofPlayers;     
        
        
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter your name: ");
        playerName = input.next();     
        System.out.println("\nWelcome " + Player.playerName + "\n");
    }           
    
    public void multiPlayer() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nNumber of Players: ");
        numberofPlayers = input.nextInt();
    
    
    }
}

        