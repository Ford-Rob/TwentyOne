/*
 * This will display the Help Menu. 
 * 
 */
package robandwade.cit260.twentyone.menus;

import java.util.Scanner;
import robandwade.cit260.twentyone.control.HelpMenuControl1;

/**
 * @author WMitchell
 * @author RFord
 */
public class HelpMenu extends Menu {
    
        private final static String[][] menuItems = {
        {"R", "Rules"},
        {"I", "Instructions"},        
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl1 helpMenuControl = new HelpMenuControl1();
    
    // default constructor
    public HelpMenu() {
        super (HelpMenu.menuItems);
        
    } 
    @Override
    // display the help menu and get the end users input selection
    public String getInput() {       
        
        String gameStatus = "playing";
        do {
            this.displayMenu();
            
            //get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "R":
                    this.helpMenuControl.displayHelpRules();
                    break;
                case "I":
                    this.helpMenuControl.displayHelpInstructions();
                    break; 
                case "Q": 
                    return "QUIT";
            }
        } while (!gameStatus.equals("QUIT"));  
        
         return gameStatus;
    }
/**
        // displays the help menu
    public final void displayHelpMenu() {
        System.out.println("\n♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧");
        System.out.println("          Help");
        System.out.println("-------------------------");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧♠♡♢♣♤♥♦♧\n");
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
        String[][] items = HelpMenuView.menuItems;

        for (String[] item : HelpMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
**/
}
