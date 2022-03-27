/* Tips
Avoid public fields except for constants
https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html
https://www.c-sharpcorner.com/UploadFile/3614a6/accessors-and-mutators-in-java/



 "In Java, when we declare a field static, exactly a single copy of that field is created and shared among all instances of that class. It doesn't matter how many times we initialize a class. There will always be only one copy of static field belonging to it. The value of this static field will be shared across all objects of either the same or any different class."

Example: So I think this has to do with making the method (or variable) accessible to other entities within the class, and making it so we only need the one instance even if we call it a lot of times. We don't have to re-declare the camera and target height over and over and keep track of all those variables, it's just declared the once and any other method or object can access that data

 
*/

The word, "mutable" has to do with whether something can be changed or not -- if something is mutable, it can be changed, if it is immutable, then it can't be, it's stuck in one specific way. I think this is probably mostly addressed when we declare a variable as final -- we are saying "this variable will never change, its value will remain this number forever."

example:

public class Cat {  
    private int Age;  
    
    public void set Age(int Age) {  
        this.Age = Age;  
    }  
    
    public int getAge() {  
        return this.Age;  
    }  
}  


