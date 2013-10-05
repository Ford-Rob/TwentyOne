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
    String gameMenuItem1 = "\nH-Hit";
    String gameMenuItem2 = "\nS-Stand";
    String gameMenuItem3 = "\nQ-Quit";
        public void displayGameMenu(){
        System.out.println("\nGame Menu\n\n ");
        System.out.println(this.gameMenuItem1);
        System.out.println(this.gameMenuItem2);
        System.out.println(this.gameMenuItem3);
    }
}
