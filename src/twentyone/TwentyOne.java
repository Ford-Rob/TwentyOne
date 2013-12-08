package twentyone;

import robandwade.cit260.twentyone.models.Deck;
import robandwade.cit260.twentyone.menus.MainMenu;
import static twentyone.Player.playerName;
import robandwade.cit260.twentyone.exceptions.MenuException;

/**
 * @author WMitchell
 * @author RFord
 */
public class TwentyOne {
    public static Hand myHand = new Hand();
    public static Player myPlayer = new Player();
    public static Deck myDeck = new Deck();
    public static int currentPlayer;

    
    public static void main(String[] args)  {
        try {
            TwentyOne myGame = new TwentyOne();
            System.out.println("\n" + "Welcome to 21.");
            myPlayer.multiPlayer();
            myPlayer.getName();
            MainMenu myMainMenu = new MainMenu();      
            myMainMenu.getInput();      
        } catch (MenuException e) {
                System.out.println("\n\t" + e.getMessage());
        } finally {
                System.out.println("\n\tGame Over");        
        }
}
        /**
        myDeck.initDeck();
        myDeck.shuffleDeck();
        TwentyOne.myHand.displayHand();
        System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue());
        GameMenuView myGameMenuView = new GameMenuView();
        myGameMenuView.getInput();
        Results myResults = new Results();
        myResults.displayResults(); */
        
        
        
    }
    
    
