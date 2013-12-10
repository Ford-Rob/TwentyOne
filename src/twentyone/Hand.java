/*
 * Created 10/18/2013 to make the Hand, add Cards, Check the value and Display
 * 
 */
package twentyone;

import robandwade.cit260.twentyone.models.Card;
import twentyone.TwentyOne;
/**
 *
 * @author RFord
 */
public class Hand {
    int place = 2;
     Card[] hand = new Card[5];
     int[] Hand = {0,0,0};
     
        
     public Hand(){
         hand[0] = new Card();
         hand[1] = new Card();
     }
     public void initHand(){
         hand = new Card[5];
         place = 2;         
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
            System.out.print(hand[i] + " ");
        }
        System.out.println("");
    }
    public int recordValue(int player){
        int handValue = 0;
        for (int i = 0; i < place; i++){
            handValue += hand[i].getCardValue();
        }
        Hand[player] = handValue;
        return handValue;    
    }
    public void displayResults() {
        if (Hand[2] > 21) {Hand[2] = 0;}
        for (int i = 0; i< TwentyOne.myPlayer.numberofPlayers; i++ ){
            if (Hand[i] > 21){
                System.out.println("I am sorry "+twentyone.Player.playerName[i] + ", you have lost.");
            } else if (Hand[i] < Hand[2]){
                System.out.println("I am sorry "+twentyone.Player.playerName[i] + ", you have lost.");
            } else if (Hand[i] > Hand[2]){
                System.out.println("Congratulations "+twentyone.Player.playerName[i] + "! You have won.");
            } else if (Hand[i] == Hand[2]){
                System.out.println(twentyone.Player.playerName[i] + "pushes.");
            }
        }
}
}