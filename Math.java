package oopexercise.pkg2;

/**
 *
 * @author Codingmarie
 */
public class Math extends CourseSubject{// #3 subclass of Pet superclass
    private String department;

    public Math(String name, double units, String department){
        //call the supperclass constructor and pass the name and weight parameters
        super(name, units);
        this.department = department;
    } 
    @Override 
    public String makeDepartment(){  //overriding the supercalss method 'makedepartment'
        return "STCS";

    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;

    }
}
