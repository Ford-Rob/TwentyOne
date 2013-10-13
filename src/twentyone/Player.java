/*
 * This will hold the Player information for the game? 
 * I need to further clarify the purpose of this class.
 * Assigned to WMitchell.
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class Player {
        playerList = new Player[4]; //Trying to have to game add multiple players
        //and save their data
        int Numberofplayers = 0;     
        playerList[Numberofplayers] = newPlayer; 
        Numberofplayers++;  
        
    public void getName() {
    
    System.out.println("Enter your name: ");
               
    }            
    
    public void displayPlayers() {
    System.out.println("\nNumber of Players: " + this.Numberofplayers);
    }

    private static class playerList {

        public playerList() {
        }
    }
}
