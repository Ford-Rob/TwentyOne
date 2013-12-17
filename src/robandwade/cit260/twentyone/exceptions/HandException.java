/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robandwade.cit260.twentyone.exceptions;

/**
 *
 * @author RFord
 */
public class HandException extends Exception {


    public HandException() {
    }

    
    public HandException(String msg) {
        super(msg);
    }
    public HandException(String message, Throwable cause) {
        super(message, cause);
    }

    public HandException(Throwable cause) {
        super(cause);
    }    
}
