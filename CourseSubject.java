package oopexercise.pkg2;

/**
 *
 * @author Codingmarie
 */
public abstract class CourseSubject { //#2 this is our Supercalss
    protected String name;  //attributes are protected
    protected double units;

    // construcor
    public CourseSubject(String name, double units){
        this.name = name;
        this.units = units;
    }

    // this method will be overriden by its subclasses
    public abstract String makeSound();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }
    public double getUnits(){
        return units;

    }
    public void setUnits(double units){
        this.units = units;

    }


}
