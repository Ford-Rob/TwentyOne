/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twentyone;

/**
 *
 * @author RFord
 */
public class Hand {
    int place = 2;
     Card[] hand = new Card[5];
        
     public Hand(){
         hand[0] = new Card();
         hand[1] = new Card();
     }
    public void addCard(){
        hand[place] = new Card();
        ++place;
    }    
    public int checkValue(){
        int handValue = 0;
        for (int i = 0; i < place; i++){
            handValue += hand[i].getCardValue();
        }
        return handValue;
        
    }
    public void displayHand(){
        for (int i = 0; i < place; i++){
            System.out.println(hand[i]);
        }
    }

}
