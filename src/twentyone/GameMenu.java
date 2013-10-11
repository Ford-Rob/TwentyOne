/*
 * This will set up the game menu
 * assigned to RFord
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class GameMenu {
    short SuitNumber = 9824;
    String gameMenuItem1 = "\n\tH-Hit";
    String gameMenuItem2 = "\tS-Stand";
    String gameMenuItem3 = "\tQ-Quit";
    byte counter = 0;
    char border;
    
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
            System.out.println(this.gameMenuItem1);
            System.out.println(this.gameMenuItem2);
            System.out.println(this.gameMenuItem3);
            counter = 0;
            while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;
                    }      
            }  
    }
}
