package twentyone;

import robandwade.cit260.twentyone.models.Deck;
import robandwade.cit260.twentyone.menus.MainMenu;
import twentyone.Player;
import robandwade.cit260.twentyone.exceptions.MenuException;
import robandwade.cit260.twentyone.frames.MainFrame;
import robandwade.cit260.twentyone.enums.ErrorType;
import robandwade.cit260.twentyone.enums.PlayerType;


/**
 * @author WMitchell
 * @author RFord
 */
public class TwentyOne {
    public static Hand myHand = new Hand();
    public static Player myPlayer = new Player();
    public static Deck myDeck = new Deck();
    public static int currentPlayer;
    public static MainFrame mainFrame = null;

public static void main(String[] args)  {
    TwentyOne twentyOne = null;
    try {
              /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    TwentyOne.mainFrame = new MainFrame();
                    TwentyOne.mainFrame.setVisible(true);
                }
            });
        }  

        catch (Throwable ex) {     
            ErrorType.displayErorrMsg("Unexpected error: " + ex.getMessage());
            ErrorType.displayErorrMsg(ex.getStackTrace().toString());           
        } 
        finally {
            if (TwentyOne.mainFrame != null) {
                TwentyOne.mainFrame.dispose();
            }
        }
}    
   
/*
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
    
    
