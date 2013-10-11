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
    String gameMenuItem1 = "\nH-Hit";
    String gameMenuItem2 = "\nS-Stand";
    String gameMenuItem3 = "\nQ-Quit";
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
            System.out.println(this.gameMenuItem1);
            System.out.println(this.gameMenuItem2);
            System.out.println(this.gameMenuItem3);
    }
}
