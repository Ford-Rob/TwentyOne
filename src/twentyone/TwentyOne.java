/*
 * 
 * 
 */
package twentyone;

import java.util.Scanner;


/**
 * @author WMitchell
 * @author RFord
 */
public class TwentyOne {
    String playerName;
    String instructions = "This is 21. \n\n"
            + "Try to get as close to 21 and beat the Dealer";
    String menuItem1 = "\nStart a Game";
    String menuItem2 = "\nHelp";
    String menuItem3 = "\nExit"
            + "";
    
    public static void main(String[] args) {
        TwentyOne myGame = new TwentyOne();
        myGame.getName();
        myGame.displayHelp();
        myGame.displayMenu();
        Card myCard = new Card();
        myCard.displayCard();
    }   
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.playerName = input.next();            
    }

    public void displayHelp() {
        System.out.println("\nWelcome " + this.playerName + "\n");
        System.out.println(this.instructions);
    }
    public void displayMenu(){
        System.out.println("\nMain Menu\n\n ");
        System.out.println(this.menuItem1);
        System.out.println(this.menuItem2);
        System.out.println(this.menuItem3);
    }
}
