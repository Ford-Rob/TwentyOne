/*
* This will be the Main Menu for the game.
* 
* 10/14/13 I copied Rob's GameMenu boarder and applied it to the 
* MainMenu improve the menu.
* 
* Assigned to WMitchell.
*/

package twentyone;

/**
* @author WMitchell
* @author RFord
*/
public class MainMenu {
    short SuitNumber = 9824;
    String mainMenuItem1 = "\n   S    Start Game";
    String mainMenuItem2 = "   H    Help";
    String mainMenuItem3 = "   E    Exit";
    byte counter = 0;
    char border;
        
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