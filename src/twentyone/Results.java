/*
 * This will display the results of the game when it ends. 
 * Assigned to WMitchell.
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class Results {
    String Won = "1";
    
    public void displayResults() {
        System.out.println("\n" + Player.playerName + "'s Results\n\nWon: " + this.Won + " Lost: " 
                + this.isLoser() +"\n");
   
    }
    
            private boolean isLoser() {
             String gameStatus = Game.QUIT;   
        for (int handValue = 22; handValue <= 30; handValue++) {
                if (handValue >= 21) { 
                    return true;
                }
            }
        return false;
    
//    This code is just to use in my for loops
//if (TwentyOne.myHand.checkValue() > 21) {
//            System.out.println("You have Busted");
//            String gameStatus = "QUIT";
//            
//        } else if (TwentyOne.myHand.checkValue() == 21) {
//            System.out.println("21! You win!");
//            String gameStatus = "QUIT";
//        } 
    

}
}