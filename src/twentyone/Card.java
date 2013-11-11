/* Modified 10/18/2013 to work better with the hand class.
 *
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class Card {
    
    private String rank;
    private char suit;// 9827 Club, 9824 Spade, 9829 Heart, 9830 Diamond
    private int cardValue;
    public String cardDisplay;
    
    public String toString() {
        return cardDisplay;
    }
                
    public int getCardValue() {
        return cardValue;
    }
    
    public Card() {
        int rndNumber;   //Random Number for generating card values
        rndNumber = (int) (Math.random()*13+1);

        if (rndNumber == 1) {
            rank = "A";
            cardValue = 11;  //Will change this to a 1 or 11 later
        } else if (rndNumber < 11 && rndNumber > 1) {
            rank = "" +rndNumber;
            cardValue = rndNumber;
        } else if (rndNumber == 11) {
            rank = "J";
            cardValue = 10;
        } else if (rndNumber == 12) {
            rank = "Q";
            cardValue = 10;
        } else if (rndNumber == 13) {
            rank = "K";
            cardValue = 10;
        }  
        rndNumber = (int) (Math.random()*4+1);

        // 9827 Club, 9824 Spade, 9829 Heart, 9830 Diamond
        if (rndNumber == 1) {
            suit = 9824;
        } else if (rndNumber == 2) {
            suit = 9827;
        } else if (rndNumber == 3) {
            suit = 9829;
        } else if (rndNumber == 4) {
            suit = 9830;
        }
        cardDisplay = this.rank + "" + this.suit;
    }
}
