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
    
    public static void main(String[] args) {
        TwentyOne myGame = new TwentyOne();
        myGame.getName();
        myGame.displayHelp();
        MainMenu myMainMenu = new MainMenu();
        myMainMenu.displayMainMenu();
        GameMenu myGameMenu = new GameMenu(); 
        myGameMenu.displayGameMenu(); 
        Players myPlayers = new Players();
        myPlayers.displayPlayers();
        Table myTable = new Table();
        myTable.displayChair();
        Card myCard = new Card();
        myCard.displayCard();
        Results myResults = new Results();
        myResults.displayResults();
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
    
}
