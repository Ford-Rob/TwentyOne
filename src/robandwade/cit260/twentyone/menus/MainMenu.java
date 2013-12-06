/*
* This will be the Main Menu for the game.
* 
* 11/16/13 -WM
* 
* Assigned to WMitchell.
*/

package robandwade.cit260.twentyone.menus;  

import java.util.Scanner;

import twentyone.Dealer;
import twentyone.Game;
import twentyone.TwentyOne;
import static twentyone.TwentyOne.myDeck;
import twentyone.Player;
import robandwade.cit260.twentyone.exceptions.MenuException;

/**
* @author WMitchell
* @author RFord
*/
public class MainMenu extends Menu {
    
    private final static String[][] menuItems = {
        {"1", "Start Game"},
        {"2", "Help"},        
        {"3", "Exit"}        
    };
 
    public MainMenu() {
        super (MainMenu.menuItems);
        
    } 
    @Override
    public String getInput() throws MenuException {       
        
        String gameStatus = Game.PLAYING;
        do {
            this.displayMenu();
            // get commaned entered
            String command = this.getCommand();
        try {
            switch (command) {
                case "1":

                    for (int i = 0; i< TwentyOne.myPlayer.numberofPlayers; i++ ){
                    myDeck.initDeck();
                    myDeck.shuffleDeck();
                    System.out.println(TwentyOne.myPlayer.currentPlayer(i) + "'s Turn");
                    TwentyOne.myHand.initHand();
                    TwentyOne.myHand.displayHand();
                    System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue() + "\n");
                    GameMenu myGameMenuView = new GameMenu();
                    myGameMenuView.getInput();
                    }
                    Dealer myDealer = new Dealer();
                    break;
                case "2":
                    HelpMenu myHelpMenu = new HelpMenu();
                    myHelpMenu.getInput();

                    break;
                case "3":

                    return "QUIT";
                default: throw  new MenuException("invalid input: " + command);
            } 
        } catch (MenuException tex) {
                System.out.println("\n\t" + tex.getMessage());
}
        } 
        while (!gameStatus.equals("QUIT"));
        TwentyOne.currentPlayer ++;
        return "QUIT";
    }
    
 /**   
    // retrieves the command entered by the end user
    protected final String getCommand() {

        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {

            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!valid) {
                new TwentyOneError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
    
    // determines if the command is valid
    private boolean validCommand(String command) {
        String[][] items = MainMenu.menuItems;

        for (String[] item : MainMenu.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
        
    public void displayMainMenu(){

        System.out.println("\n♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧");
        System.out.println("       Main Menu");
        System.out.println("-------------------------");

        for (int i = 0; i < MainMenu.menuItems.length; i++) {
            System.out.println("   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧\n");
    }*/
        
    
                    
             
    }