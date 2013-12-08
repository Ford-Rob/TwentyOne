/*
 * Controls for the Game Menu 10/18/13 RFord
 * 
 */
package robandwade.cit260.twentyone.control;

import robandwade.cit260.twentyone.menus.GameMenu;
import robandwade.cit260.twentyone.models.Dealer;
import twentyone.TwentyOne;

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
        if (TwentyOne.myHand.checkValue() > 21) {
            System.out.println("You have Busted");
//            String gameStatus = "QUIT";
            
        } else if (TwentyOne.myHand.checkValue() == 21) {
            System.out.println("21! You win!");
//            String gameStatus = "QUIT";
        } 
    }
             
    
    public void stand(){
        System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue() + "\n");
//        String gameStatus = "QUIT";
    }

    public void deal() {

                    myDeck.initDeck();
                    myDeck.shuffleDeck();
                    for (int i = 0; i< TwentyOne.myPlayer.numberofPlayers; i++ ){
                    System.out.println(TwentyOne.myPlayer.currentPlayer(i) + "'s Turn");
                    TwentyOne.myHand.initHand();
                    TwentyOne.myHand.displayHand();
                            
                        int check = TwentyOne.myHand.checkValue();
                        if (check == 21) {
                        System.out.println("21 you win!");
                        } 

            
                    System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue() + "\n");
                    GameMenu myGameMenuView = new GameMenu();
                    myGameMenuView.displayMenu();
                    myGameMenuView.getInput();
                    }
                    Dealer myDealer = new Dealer();        
    }
}
