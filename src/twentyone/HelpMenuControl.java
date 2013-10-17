/*
 * This will display the HelpMenuView Menu. 
 * 
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class HelpMenuControl {

/**
 * Rules can be modified to simplify the game.
 */                
    
        public void displayHelpRules() {
        
        System.out.println(
"\n\n21 RULES\n\n"+                
"The objective of the game is to get the highest total without exceeding 21.\n" +
"Each player has an independent game against the dealer and the objective is to beat the dealer.\n" +
"If the player's cards total is higher then 21, it is called a \"bust\" and the dealer wins, Even if the dealer has a bust as well.\n" +
"If the player and the dealer have the same point value it counts as a draw and called a \"push\".\n" +
"A 21 hand value is calculated as follows:\n" +
"Cards of 2 - 10 are worth their face value.\n" +
"Jack, Queen and King are worth 10 each.\n" +
"The Ace card is worth 11, unless it causes the player to bust then the Ace can be counted as a 1.\n" +
"A 2 cards hand with Ace and a 10 value card is called a \"blackjack\" and it is a winning hand unless the dealer has a blackjack hand as well, in which case it is a draw (\"push\").\n" +
"After all players have placed their bets, the dealer deals each player with 2 cards including himself, the dealers first card will be face up and the other is face down.\n");        
    }

        public void displayHelpInstructions() {
        
        System.out.println(
"21 PLAYER INSTRUCTIONS\n" +
"In 21, the player has 5 options for playing his hand:\n" +
"1. Hit - Get another card.\n" +
"2. Stand - Stay with the current hand.\n" +
"3. Surrender - Forfeit the hand and get back just half of the wager.\n" +
"4. Double down - Double the bet amount and take just exactly 1 more card.\n" +
"5. Split - possible only when both cards are of the same value, means to double the wager and have each card be the first card of a new hand.\n" +
"The player finishes their turn when they decide to stand or double down or if they bust.\n" +
"After all players have played their hand, the dealer revels his other card and starts to play his hand.\n" +
"House rules say that the dealer must continue to Hit until he has at least 17.\n");
    
        }

}

