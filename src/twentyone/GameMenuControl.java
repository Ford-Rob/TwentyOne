/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
            System.out.println("You have busted");
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
