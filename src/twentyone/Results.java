/*
 * This will display the results of the game when it ends. 
 * Assigned to WMitchell.
 * 
 * 
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class Results {
     
    public void displayResults() {
 
        System.out.println("\n" + Player.nameInput + "'s Results\n\n21!: " + this.is21() + " Lost: " 
                + this.isLoser() +"\n");
   
    }
    
            public int isLoser() {   
        //Individual L11 All our exceptions are currently handled but when this 
        //class is complete it could use on here if the program tries to give a Results output with no Wins or Loses
        for (int i=0; i < 1000; i++) {
                if (TwentyOne.myHand.checkValue() > 21) { 
                    return 1;
                }
                else
                    
        return 0;
        }
        return 1;
            }
            
            
            public int is21() {   
        
        for (int i=0; i < 1000; i++) {
                if (TwentyOne.myHand.checkValue() == 21) { 
                    return 1;
                }
                else
                    
        return 0;
        }
        return 1;
            }
           

}
        


