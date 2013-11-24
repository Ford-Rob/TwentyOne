/*
* Created by RFORD 11/23/13 for Lesson 9 Individual Assignment
* Will be deleted upon grading...
 */
package twentyone;

/**
 *
 * @author RFord
 */
public class Work extends Busy{
    private final static String [] work = {
        "Work","Busy"
};


    
    public Work() {
        super (Work.work);
    }

 
@Override
    public void displayWork(){
        System.out.println(bigWork);
    }    
}
