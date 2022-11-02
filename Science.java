package oopexercise.pkg2;

/**
 *
 * @author Codingmarie
 */
public class Science extends CourseSubject{
    private String branch;

    public Science(String name, double units, String branch){
        //call the supperclass constructor and pass the name and weight parameters
        super(name, units);
        this.branch = branch;

    }

    @Override
    public String makeDepartment(){  //overriding the superclass method 'makeSound'
        return "BIPSU!";

    }
    public String getBranch(){  
        return branch;

    }
    public void setBranch(String branch){
        this.branch = branch;
    }

}
