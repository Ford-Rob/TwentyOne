/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twentyone;

/**
 *
 * @author RFord
 */
public class Card {
    String Suit = "Clubs";
    String Rank = "10";
    
    public void displayCard() {
        System.out.println("\n" + Rank + " of " + Suit + "\n");
    }
}
