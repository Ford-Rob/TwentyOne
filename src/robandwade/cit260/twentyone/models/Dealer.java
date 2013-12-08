/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package robandwade.cit260.twentyone.models;


import twentyone.TwentyOne;
/*
 *
 * @author RFord
 */


public class Dealer {

    public Dealer() {

        System.out.println("Dealer's Turn");
        TwentyOne.myHand.initHand();
        TwentyOne.myHand.displayHand();

        if (TwentyOne.myHand.checkValue() == 21) {
            System.out.println("Dealer holds 21");
            }
            else if (TwentyOne.myHand.checkValue() > 17) {
            System.out.println("Dealer holds " + TwentyOne.myHand.checkValue());
            }
            else while (TwentyOne.myHand.checkValue() <= 17) {
                TwentyOne.myHand.addCard();
                TwentyOne.myHand.displayHand();
                System.out.println("Dealer Shows " + TwentyOne.myHand.checkValue());
                
            }
    }
}

