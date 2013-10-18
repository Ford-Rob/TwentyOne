/*
 * This will set up the game menu
 * assigned to RFord
 */
package twentyone;

import java.util.Scanner;

/**
 * @author WMitchell
 * @author RFord
 */
public class GameMenuView {
    short SuitNumber = 9824;
    byte counter = 0;
    char border;
    private final static String[][] gameMenuItems = {
    {"H", "Hit"},
    {"S", "Stand"},        
    {"Q", "Quit Game"}        
    };
    
    private GameMenuControl gameMenuControl = new GameMenuControl();
    
        public void displayGameMenu(){
            while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;
                    }      
            }                           
            System.out.println("\n\tGame Menu ");
            counter = 0;
            while (++counter < 26){
                    border=(char)SuitNumber;
                    System.out.print("-");
 
            }  
            System.out.println("");
            for (int i = 0; i < GameMenuView.gameMenuItems.length; i++) {
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
            // display the help menu and get the end users input selection
    public String getInput() {       
        
        String gameStatus = "playing";
        do {
            this.displayGameMenu();
            
            //get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "H":
                    this.gameMenuControl.hit();
                    break;
                case "S":
                    this.gameMenuControl.stand();
                    break; 
                case "Q": 
                    return "QUIT";
            }
        } while (!gameStatus.equals("QUIT"));  
        
         return gameStatus;
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
        String[][] items = GameMenuView.gameMenuItems;

        for (String[] item : GameMenuView.gameMenuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
}
