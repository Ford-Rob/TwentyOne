/*
* This will be the Main Menu for the game.
* 
* 10/14/13 Copied Rob's GameMenu boarder. -WM
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
    String mainMenuItem1 = "\n   S    Start Game";
    String mainMenuItem2 = "   H    Help";
    String mainMenuItem3 = "   X    eXit";
    byte counter = 0;
    char border;
    
        // Create instance of the HelpMenuControl (action) class
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    // default constructor
    public MainMenuView() {
        
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
        System.out.println(this.mainMenuItem1);
        System.out.println(this.mainMenuItem2);
        System.out.println(this.mainMenuItem3);
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