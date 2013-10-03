/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgTwentyOne;

import java.util.Scanner;

/**
 *
 * @author RFord
 */
public class TwentyOne {
    String playerName;
    String instructions = "Welcome to 21. \n\n"
            + "Try to get as close to 21 and beat the Dealer";

    public static void main(String[] args) {
        TwentyOne myGame = new TwentyOne();
        myGame.getName();
        myGame.displayHelp();
    }   
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.playerName = input.next();
            
    }

public void displayHelp(){
    System.out.println("\nWelcome " + this.playerName + "\n");
    System.out.println(this.instructions);
}
}
