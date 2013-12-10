/*
 * Controls for the Game Menu 10/18/13 RFord
 * 
 */
package robandwade.cit260.twentyone.control;

import robandwade.cit260.twentyone.menus.GameMenu;
import robandwade.cit260.twentyone.models.Dealer;
import twentyone.TwentyOne;
import twentyone.Game;

import static twentyone.TwentyOne.myDeck;

/**
 *
 * @author RFord
 */
public class GameMenuControl {
   
    public void hit(){
        TwentyOne.myHand.addCard();
        TwentyOne.myHand.displayHand();
        System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue() + "\n");

    }
             
    
    public void stand(){

        System.out.println("Player Stands with " + TwentyOne.myHand.checkValue() + "\n");
    }

    
}
