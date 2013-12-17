/*
 * Created 10/18/2013 to make the Hand, add Cards, Check the value and Display
 * 
 */
package twentyone;

import robandwade.cit260.twentyone.models.Card;
import robandwade.cit260.twentyone.exceptions.HandException;
import twentyone.TwentyOne;
/**
 *
 * @author RFord
 */
public class Hand {
    int place = 2;
     Card[] hand = new Card[5];
     int[] Hand = {0,0,0};
     boolean hasAce = false;     
     
        
     public Hand(){
         hand[0] = new Card();
         hand[1] = new Card();
     }
     public void initHand(){
         hasAce = false;
         Hand [0] = 0;
         Hand [1] = 0;
         Hand [2] = 0;
         hand = new Card[5];
         place = 2;         
         hand[0] = new Card();
         hand[1] = new Card();
     }
     
     public void clearHand(){

     }
    public void addCard(){
        hand[place] = new Card();
        ++place;
    }    
    public int checkValue(){
        int handValue = 0;

        for (int i = 0; i < place; i++){
            if (hand[i].getCardValue() == 11) {
                hasAce = true;
            }
            handValue += hand[i].getCardValue();
            if (handValue > 21) {
                if (hasAce == true) {
                handValue = handValue -10;
                hasAce = false;}
            }
        }
        return handValue;    
    }
    public String returnFileName(int i){
        String cardFileName ="";
        try {
            cardFileName = hand[i].getFileName();
        } catch (NullPointerException e) {    
            cardFileName= "blank";
        }    


        return cardFileName;
    }
    public void displayHand(){
        for (int i = 0; i < place; i++){
            System.out.print(hand[i] + " ");
        }
        System.out.println("");
    }
    public int recordPlayer(){
        int handValue = 0;
        for (int i = 0; i < place; i++){
            handValue += hand[i].getCardValue();
                    System.out.println( handValue);
        }
        Hand[1] = handValue;
        System.out.println(Hand[1]);
        System.out.println(Hand[2]);
        return handValue;    
    }
        public int recordValue(int player){
        int handValue = 0;
        for (int i = 0; i < place; i++){
            handValue += hand[i].getCardValue();
                    System.out.println( handValue);
        }
        Hand[2] = handValue;
        System.out.println(Hand[1]);
        System.out.println(Hand[2]);
        return handValue;    
    }
    
    public int recordDealer(){
        int handValue = 0;
        for (int i = 0; i < place; i++){
            handValue += hand[i].getCardValue();
                    System.out.println( handValue);
        }
        Hand[2] = handValue;
        System.out.println(Hand[1]);
        System.out.println(Hand[2]);
        return handValue;    
    }
    public String displayResults() {
        String results = "";
        System.out.println(Hand[1] + " " + Hand[2]);
        if (Hand[2] > 21) {Hand[2] = 0;}
        if (Hand[1] > 21) {Hand[1] = 0;}

            if (Hand[1] < Hand[2]){
                results = Hand[1]  +" "+ Hand[2] + "I am sorry, you have lost.";
            } else if (Hand[1] > Hand[2]){
                results = Hand[1]  +" "+ Hand[2] + "Congratulations! You have won.";
            } else if (Hand[1] == Hand[2]){
                results = Hand[1] +" "+ Hand[2] + "It is a tie.";
          
            
        }return results;
}
        public String returnHand(){
        String myHand = "";    
        
        for (int i = 0; i < place; i++){
            myHand = myHand + hand[i] + " ";
        }
        return myHand;
        }
}