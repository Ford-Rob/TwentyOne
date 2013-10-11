/*
y
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class Card {
    
    String Rank = "10";
    char Suit = 9827; // 9827 Club, 9824 Spade, 9829 Heart, 9830 Diamond
    
    
    public void displayCard() {
        System.out.println("\n" + this.Rank + " of " + this.Suit + "\n");
    }
}
