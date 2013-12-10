/*
 * This will set up the game menu 
 * assigned to RFord - check
 */
package robandwade.cit260.twentyone.menus;

import java.util.Scanner;
import robandwade.cit260.twentyone.control.GameMenuControl;
import robandwade.cit260.twentyone.interfaces.ShowHelp;
import twentyone.TwentyOne;

/**
 * @author WMitchell
 * @author RFord
 */
public class GameMenu extends Menu implements ShowHelp {
//    short SuitNumber = 9824;
//    byte counter = 0;
//    char border;
    private final static String[][] menuItems = {

    {"H", "Hit"},
    {"S", "Stand"},        
       
    };
    public GameMenu() {
        super (GameMenu.menuItems);
    }
    
    private GameMenuControl gameMenuControl = new GameMenuControl();
    

@Override            // display the help menu and get the end users input selection
    public String getInput() {       
        
        
        String gameStatus = "waiting";
        do {
            if (TwentyOne.myHand.checkValue() == 21){
                return "QUIT";
            }
            //get commaned entered
            
            String command = getCommand();
            try{
            switch (command) {
                case "H":
                    gameMenuControl.hit();
                  
                    if (TwentyOne.myHand.checkValue() > 21){
                    System.out.println ("You have Busted!");                        
                        return "QUIT";
                    } else if (TwentyOne.myHand.checkValue() == 21){
                    System.out.println ("Player has 21!");                        
                        return "QUIT";
                    } 
                    displayMenu();  
                    break;
                case "S":
                    gameMenuControl.stand();
                    return "QUIT";
            }
            }
            catch (Exception e){
                    System.out.println ("Please Enter H or S");
                    }

        } while (!gameStatus.equals("QUIT"));  
        
         return gameStatus;
    }

    @Override
    public void HelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //WM - L10 Individual Assignment interface
    }

/**   
        public void displayGameMenu(){

            while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;
                    }      
            }                           
            System.out.println("\n\tGame Menu");
            counter = 0;
            while (++counter < 26){
                    border=(char)SuitNumber;
                    System.out.print("-");
 
            }  
            System.out.println("");
            for (int i = 0; i < GameMenu.gameMenuItems.length; i++) {
            System.out.println("\t" + gameMenuItems[i][0] + " - " + gameMenuItems[i][1]);
        }
            counter = 0;
            while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;
                    }  
            }  
            counter = 0;
            System.out.println("\nEnter your choice: ");
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
        String[][] items = GameMenu.gameMenuItems;

        for (String[] item : GameMenu.gameMenuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    */
}
