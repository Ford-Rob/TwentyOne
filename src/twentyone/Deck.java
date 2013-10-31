/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twentyone;



/**
 * 
 * @author RFord 
 */
public class Deck {
    int[][] deck = new int[4][13];

    public void initDeck(){
        int counter = 1;
        for (int s=0; s < 4; s++){
            for (int r=0; r < 13; r++){
                deck[s][r]=counter;
                counter++;

            }
        }
    }
    public void shuffleDeck(){
        System.out.println("\nShuffling\n");
        int place;
        for (int s=0; s < 4; s++){
            for (int r=0; r < 13; r++){
                place=deck[s][r];
                int rank = (int)(Math.random()*13);
                int suit = (int)(Math.random()*4);
                deck[s][r] = deck[suit][rank];
                deck[suit][rank] = place;
            }
        }
    }
    public void showDeck(){
                for (int s=0; s < 4; s++){
            for (int r=0; r < 13; r++){
                char suit = 0;
                String rank = "1";
                int value = deck[s][r];
                    if (deck[s][r] < 14){
                        suit = 9824;
                    } else if (deck[s][r] < 27 && deck[s][r] > 13){
                        suit = 9827;
                        value = value-13;
                    } else if (deck[s][r] < 40 && deck[s][r] > 26){
                        suit = 9829;
                        value = value-26;
                    } else if (deck[s][r] < 53 && deck[s][r] > 39){
                        suit = 9830;
                        value = value-39;  }
        if (value == 1) {
            rank = "A";
             //Will change this to a 1 or 11 later
        } else if (value < 11 && value > 1) {
            rank = "" +value;

        } else if (value == 11) {
            rank = "J";

        } else if (value == 12) {
            rank = "Q";
            
        } else if (value == 13) {
            rank = "K";

        }  
                                
                System.out.print(rank + suit + " ");
            }
        }

}
    
}
