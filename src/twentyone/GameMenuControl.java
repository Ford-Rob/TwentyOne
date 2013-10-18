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
        
             
    }
    public void stand(){
        System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue());        
    }

    
}
