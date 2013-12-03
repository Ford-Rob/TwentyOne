/*
 * Controls the Help Menu. 
 * 
 */
package robandwade.cit260.twentyone.control;

/**
 * @author WMitchell
 * @author RFord
 */
public class HelpMenuControl {               
    
        public void displayHelpRules() {
        
        System.out.println(
"\n21 RULES\n"+                
"\nThe objective of the game is to get the highest total without exceeding 21.\n" +
"Each Player has an independent game against the Dealer.\n" +
"If the Player's cards total is higher then 21 it is called a Bust and the Dealer wins even if they Bust as well.\n" +
"If the Player and the Dealer have the same point value it counts as a draw and called a Push.\n" +
"Cards of 2 - 10 are worth their face value.\n" +
"Jack, Queen and King are worth 10 each.\n" +
"The Ace is worth 11, unless it causes the player to bust, then the Ace is counted as 1.\n" +
"A hand with an Ace and a 10 value card is called a Blackjack. It is a winning hand unless the Dealer has a Blackjack hand as well, in which case it is a Push.\n" +
"To start, the Dealer deals each Player two cards including themselves, the first card will be face up and the other is face down.\n");        
    }

        public void displayHelpInstructions() {
        
        System.out.println(
"\n21 PLAYER INSTRUCTIONS\n" +
"\nThe Player has two options for playing their hand:\n" +
"1. Hit - Get another card.\n" +
"2. Stand - Stay with the current hand.\n" +
"The Player finishes their turn when they decide to Stand or if they Bust.\n" +
"After all Players have played their hand, the Dealer reveals their other card. The Dealer then plays their hand.\n" +
"The Dealer must continue to Hit until they have at least 17.\n");
    
        }

}

