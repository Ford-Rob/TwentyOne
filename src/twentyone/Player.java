/*
 * This will hold the Player information for the Player and the Dealer. 
 * 
 * 10/14 See MainMenu class. I was able to move all of the Player code from the 
 * TwentyOne class to here. 
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
        
        
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter your name: ");
        playerName = input.next();     
        System.out.println("\nGood Luck " + Player.playerName + "!\n");
    }           
    
    public void Dealer() {
        
    
    
    }
}

        