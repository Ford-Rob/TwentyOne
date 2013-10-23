/*
* This will be the Main Menu for the game.
* 
* 10/19/13 Rebuilt and split class for individual Week 4 assignment. -WM
* 
* Assigned to WMitchell.
*/

package twentyone;  

import java.util.Scanner;

/**
* @author WMitchell
* @author RFord
*/
public class MainMenuView {
    
    private final static String[][] menuItems = {
        {"1", "Start Game"},
        {"2", "Help"},        
        {"3", "Exit"}        
    };
    
    
        // Create instance of the HelpMenuControl (action) class
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    // default constructor
    public MainMenuView() {
        
    } 
    
    public String getInput(Object object) {       
        
        String gameStatus = Game.PLAYING;
        do {
            this.displayMainMenu();

            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "1":
                    System.out.println("");
                    TwentyOne.myHand.displayHand();
        System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue());
                    GameMenuView myGameMenuView = new GameMenuView();
                    myGameMenuView.getInput();
                    break;
                case "2":
                    HelpMenuView myHelpMenuView = new HelpMenuView();
                    myHelpMenuView.getInput();
                    break;
                case "3":
                    return "QUIT";
            }
        } while (!gameStatus.equals("QUIT"));

        return "QUIT";
    }
    
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
        String[][] items = MainMenuView.menuItems;

        for (String[] item : MainMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
        
    public void displayMainMenu(){
        
        System.out.println("\n♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧");
        System.out.println("        Main Menu");
        System.out.println("-------------------------");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧\n");
    }
        
    
                    
             
    }
