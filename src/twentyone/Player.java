/*
 * This will hold the Player information for the game. 
 * 
 * 10/12 Tried to use this class to complete Week 3 individual assignment and 
 * add multiple players, maybe I have a foundation, but it is beyond me at this 
 * time. 
 * 
 * 10/14 Still working on Player with no luck. See MainMenu.
 * 
 * Assigned to WMitchell.
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class Player {
        int Numberofplayers = 1;     
        
        
    public void getName() {
    
    System.out.println("Enter your name: ");
               
    }            
    
    public void displayPlayers() {
    System.out.println("\nNumber of Players: " + this.Numberofplayers);
    
    }
}

        