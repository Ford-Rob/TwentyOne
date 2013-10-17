/*
 * This will display the Help Menu. 
 * 
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class Help {
        String instructions = "\n\nThis is 21. \n\n"
            + "Try to get as close to 21 and beat the Dealer";
    
        public void displayHelp() {
        
        System.out.println(this.instructions);
    }
    }
}
