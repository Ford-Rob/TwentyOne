/*
 * Controls for the Game Menu 10/18/13 RFord
 * 
 */
package twentyone;

/**
 *
 * @author RFord
 */
public class GameMenuControl {
    
    public void hit(){
        TwentyOne.myHand.addCard();
        TwentyOne.myHand.displayHand();
        System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue());
        if (TwentyOne.myHand.checkValue() > 21) {
            System.out.println("You have Busted");
//            String gameStatus = "QUIT";
            
        } else if (TwentyOne.myHand.checkValue() == 21) {
            System.out.println("21! You win!");
//            String gameStatus = "QUIT";
        } 
    }
             
    
    public void stand(){
        System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue());
//        String gameStatus = "QUIT";
    }

    
}
