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
    short SuitNumber = 9824;
    private final static String[][] menuItems = {
        {"S", "Start Game"},
        {"H", "Help"},        
        {"X", "eXit"}        
    };
    byte counter = 0;
    char border;
    
        // Create instance of the HelpMenuControl (action) class
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    // default constructor
    public MainMenuView() {
        
    } 
    
    public String getInput(Object object) {       
        
        TwentyOne myGame = new TwentyOne();
        do {
            this.displayMainMenu();

            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "S":
                    GameMenuView myGameMenuView = new GameMenuView();
                    myGameMenuView.getInput();
                    break;
                case "H":
                    HelpMenuView myHelpMenuView = new HelpMenuView();
                    myHelpMenuView.getInput();
                    break;
                case "X":
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
        while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;
                    }      
            }                           
            System.out.println("\n\tMain Menu ");
            counter = 0;
            while (++counter < 26){
                    border=(char)SuitNumber;
                    System.out.print("-");
 
            }  
        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        counter = 0;
            while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;}
        
    
                    
             
    }
    
    }
}