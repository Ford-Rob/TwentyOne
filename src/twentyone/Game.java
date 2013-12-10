/*
 * 11/14/13     Major clean up this class, removed all unneeded code and deleted Table class for Group Assignment.
 */
package twentyone;

import robandwade.cit260.twentyone.menus.GameMenu;
import robandwade.cit260.twentyone.models.Dealer;

/**
 *
 * @author Wade
 *
 */
public class Game {
    
    public static final String PLAYING = "PLAYING"; 
    private String status;
    public String getStatus() {
        return status;
    }
    GameMenu myGameMenu = new GameMenu();
    
    public void playGame() {

        for (int i = 0; i< TwentyOne.myPlayer.numberofPlayers; i++ ){
            System.out.println(TwentyOne.myPlayer.currentPlayer(i) + "'s Turn");
            TwentyOne.myHand.initHand();
            TwentyOne.myHand.displayHand();                
            int check = TwentyOne.myHand.checkValue();
            if (check == 21) {
                System.out.println("21 you win!");
                }           
            System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue() + "\n");
            myGameMenu.displayMenu();
            myGameMenu.getInput();
            TwentyOne.myHand.recordValue(i);
        }
        Dealer myDealer = new Dealer();   
        TwentyOne.myHand.recordValue(2);
        TwentyOne.myHand.displayResults();

    }

}