/*
* This will be the super-class Menu for the game for the paired programming assignment Week 9.
* 
*/

package robandwade.cit260.twentyone.menus;  

import java.util.Scanner;
import twentyone.TwentyOneError;
import static twentyone.TwentyOne.myDeck;
import robandwade.cit260.twentyone.interfaces.DisplayInfo;
import robandwade.cit260.twentyone.interfaces.EnterInfo;
import robandwade.cit260.twentyone.exceptions.MenuException;

/**
* @author WMitchell
* @author RFord
*/

public abstract class Menu implements DisplayInfo, EnterInfo {
    short SuitNumber = 9824;
    byte counter = 0;
    char border;
    private  String[][] menuItems = null;
      

    
//    private MenuControl MenuControl = new MenuControl();
    
    public Menu() {
    }
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    public void displayMenu(){

            while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;
                    }      
            }                           
            System.out.println("\n\t Menu");
            counter = 0;
            while (++counter < 26){
                    border=(char)SuitNumber;
                    System.out.print("-");
 
            }  
            System.out.println("");

            for (int i = 0; i < menuItems.length; i++) {
            System.out.println("\t" + menuItems[i][0] + " - " + menuItems[i][1]);
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

    public String getCommand() {

        try {
            Scanner inFile = new Scanner(System.in);
            String command;
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            String[][] items = menuItems;
            for (String[] item : menuItems) {
                if (item[0].equals(command)) {
                    return command;
                }
            }
            throw new MenuException("invalid input: " + command);
        }  catch (MenuException e){
            System.out.println("\nPlease enter a valid option: ");            
            return getCommand();
        }    
    }
    /**
     *
     * @param object
     * @return
     */
    public abstract String getInput() throws MenuException;
}

