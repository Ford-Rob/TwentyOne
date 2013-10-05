/*
y
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class Card {
    String Suit = "Clubs";
    String Rank = "10";
    
    public void displayCard() {
        System.out.println("\n" + this.Rank + " of " + this.Suit + "\n");
    }
}
