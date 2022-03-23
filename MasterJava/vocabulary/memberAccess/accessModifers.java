package MasterJava.vocabulary.memberAccess;


// https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
/* Tips
Avoid public fields except for constants
*/

public class accessModifers {
        
    private int cadence;
    private int gear;
    private int speed;
        
    // add an instance variable for the object ID
    private int id;
    
    // add a class variable for the
    // number of Bicycle objects instantiated
    private static int numberOfBicycles = 0;
        
}