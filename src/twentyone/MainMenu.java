/*
 * This will be the Main Menu for the game.
 * Assigned to WMitchell.
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class MainMenu {
    String menuItem1 = "\nStart a Game";
    String menuItem2 = "\nHelp";
    String menuItem3 = "\nExit"
            + "";
    
    
    public void displayMenu(){
        System.out.println("\nMain Menu\n\n ");
        System.out.println(this.menuItem1);
        System.out.println(this.menuItem2);
        System.out.println(this.menuItem3);
    }
}
