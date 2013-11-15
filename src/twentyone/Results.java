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
     
    public void displayResults() {
 
        System.out.println("\n" + Player.nameInput + "'s Results\n\n21!: " + this.is21() + " Lost: " 
                + this.isLoser() +"\n");
   
    }
    
            public int isLoser() {   
        
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
           
//            11/2/13 Lesson 6 Individual Assignment for Wade Mitchell.
//            I'm going to activate this code after the game has 
//            developed further.
                    
            public static void displayTotalResults (String[] args){
        int blackjack[]={1,0,1,0,0,0,1,0,0,1};
        int lost[]={0,1,0,1,1,1,0,1,1,0};
        int sum = 0;
        for (int i:blackjack)
            sum+=i;
        for (int i:lost)
            sum+=i;
}
        
}

