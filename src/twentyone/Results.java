/*
 * This will display the results of the game when it ends. 
 * Assigned to WMitchell.
 * 
 * 10/26/13 Worked on Results to diplay when the gamed is exited to show
 * how many games were Lost. Won and Push results will be added later.
 * 
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class Results {
     
    String Won = "1";
    
    
    
    public void displayResults() {
 
        System.out.println("\n" + Player.nameInput + "'s Results\n\nWon: " + this.Won + " Lost: " 
                + this.isLoser() +"\n");
   
    }
    
            private boolean isLoser() {
             String gameStatus = Game.QUIT;   
        
        for (int handValue = 22; handValue <= 30; handValue++) {
                if (handValue >= 21) { 
                    return true;
                }
            }
        return true;
    
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
