/*
* Created by RFORD 11/23/13 for Lesson 9 Individual Assignment
* Will be deleted upon grading...
 */
package twentyone;

/**
 *
 * @author RFord
 */
public abstract class Busy {
    String [] work = {
        "Busy","Work"
};
    String bigWork = "";

    
    public Busy() {
    }
    public Busy(String [] work ){
        this();
        this.work = work;
    }  
    protected final void combineString(){

            for (int i = 0; i < work.length; i++) {
                bigWork = bigWork + " " + work[i];
        }
    }
    public abstract void displayWork();
}
