/* Class and Objects */
    // Class is the set of instructions that describe how an instance can behave and what information it contains.
    // To create an object(an instance of a class), we need a create a constructor method. Constructor is defined within a class.
    
public class Car {
    // Constructor method
    public Car() {
        // instructions for creating a Car instance
        System.out.println("I am inside the constructor method");
    }

    // To create an instance, we need to call or invoke the constructor withing main
    public static void main(String[] args) {
        Car ferrari = new Car();
        // Car before the variable name ferrary is a reference data type. This means that the value of our variable is a reference
        // to an instance's memory address. Value = reference to an instance's memory address.
        // after = we use new keyword to indicate that we're creating an instance.

    }
}