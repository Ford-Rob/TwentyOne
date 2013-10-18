/*
 * This will display an Error message. 
 * 
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class TwentyOneError {
 
    public Object displayError(Object object) {
        String message = (String) object;
        System.out.println("\t ERROR: " + message);
        return null;
    }
}
