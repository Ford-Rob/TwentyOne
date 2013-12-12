/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robandwade.cit260.twentyone.enums;

/**
 *

 */
public enum HelpType {
        INSTRUCTIONS ("The Player has two options for playing their hand:\n" +
"1. Hit - Get another card.\n" +
"2. Stand - Stay with the current hand.\n" +
"The Player finishes their turn when they decide to Stand or if they Bust.\n" +
"After all Players have played their hand, the Dealer reveals their other card. The Dealer then plays their hand.\n" +
"The Dealer must continue to Hit until they have at least 17.\n"),
        
        RULES ("The objective of the game is to get the highest total without exceeding 21." +
"Each Player has an independent game against the Dealer." +
"If the Player's cards total is higher then 21 it is called a Bust and the Dealer wins even if they Bust as well." +
"If the Player and the Dealer have the same point value it counts as a draw and called a Push." +
"Cards of 2 - 10 are worth their face value." +
"Jack, Queen and King are worth 10 each." +
"The Ace is worth 11, unless it causes the player to bust, then the Ace is counted as 1." +
"A hand with an Ace and a 10 value card is called a Blackjack. It is a winning hand unless the Dealer has a Blackjack hand as well, in which case it is a Push." +
"To start, the Dealer deals each Player two cards including themselves, the first card will be face up and the other is face down."),
          
        ;
        
        String helpText;

    private HelpType(String helpText) {
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
    
    

}
