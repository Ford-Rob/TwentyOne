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
    String Won = "1";
    String Lost = "0";
    
    public void displayResults() {
        System.out.println("\n\nWon: " + this.Won + " Lost: " 
                + this.Lost + "\n");    
    }
}
