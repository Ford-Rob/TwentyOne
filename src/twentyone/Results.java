/*
 * This will display the results of the game when it ends. 
 * Assigned to WMitchell.
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class Results {
    String Win = "1";
    String Lose = "0";
    
    public void displayResults() {
        System.out.println("\nPlayer 1: Won " + this.Win + " Lost " 
                + this.Lose + "\n");    
    }
}
