package oopexercise.pkg2;

/**
 *
 * @author Codingmarie
 */
public class MainProgram {//#1 Main class
    public static void main(String[] args){
        CourseSubject subject;    // superclass object
        Math math  = new Math("Brando Torres", 3, "German Sheperd"); //subclass object 
        Science science = new Science("Kate Nur", 2, "Larrazabal"); //another subclass object 

        subject = math;
        // calling the accessors from the superclass object
        System.out.println(subject.deptName() + "" + "My name is "+ subject.getName());

        subject = science;
        System.out.println(subject.deptName() + "" + "My name is "+ subject.getName());

    }
	}    
}
