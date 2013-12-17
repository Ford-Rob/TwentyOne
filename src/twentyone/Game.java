/*
 * 11/14/13     Major clean up this class, removed all unneeded code and deleted Table class for Group Assignment.
 */
package twentyone;

import robandwade.cit260.twentyone.menus.GameMenu;
import robandwade.cit260.twentyone.models.Dealer;
import robandwade.cit260.twentyone.enums.PlayerType;
import twentyone.Player;
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
    private Player playerA;

    
    GameMenu myGameMenu = new GameMenu();
    
    public void playGame() {
 

            TwentyOne.myHand.initHand();
            TwentyOne.myHand.displayHand();                
            int check = TwentyOne.myHand.checkValue();
            if (check == 21) {
                System.out.println("21 you win!");
                }           
            System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue() + "\n");
            myGameMenu.displayMenu();
            myGameMenu.getInput();
            TwentyOne.myHand.recordValue(0);

        Dealer myDealer = new Dealer();   


    }
    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }
}
