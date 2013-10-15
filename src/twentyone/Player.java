/*
 * This will hold the Player information for the game. 
 * 
 * 10/12 Tried to use this class to complete Week 3 individual assignment and 
 * add multiple players, maybe I have a foundation, but it is beyond me at this 
 * time. 
 * 
 * 10/14 Still working on Player with no luck. See MainMenu. I was able to move 
 * all of the Player code from the TwentyOne class to here. 
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
    int Numberofplayers = 1;     
        
        
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.playerName = input.next();            
    }           
    
    public void displayPlayers() {
    System.out.println("\nNumber of Players: " + this.Numberofplayers);
    
    }
}

        