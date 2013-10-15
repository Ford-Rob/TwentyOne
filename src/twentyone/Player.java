/*
 * This will hold the Player information for the game. 
 * 
 * 10/14/13 Tried to use this class to complete Week 3 individual assignment and 
 * add multiple players, but it is beyond me at this time. For now I will just 
 * try to copy Rob's GameMenu design and apply it to the MainMenu so I can 
 * learn from what he did.
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

        