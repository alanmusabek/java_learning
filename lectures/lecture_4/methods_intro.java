// Methods create behaviour for classs, fields create a state.

/* Methods are repeatable, modular blocks of code used to accomplish
specific tasks. */

// Defining methods
public class accountBank {
    String nameOfOwner;
    double bankBalance;
    public Bank(String name, double balance) {
        nameOfOwner = name;
        bankBalance = balance;
    }
    // public means that other classes can access this method
    // void keyword means that there is no specific output from the method
    public void checkBalance() {
        System.out.println("Your balance is " + bankBalance);
    }
    
    public static void main(String[] args) {
        /* When we add a non-static method to a class, it becomes available to use on an object
        of that class */
        // To call a method you must first reference an object and then use the dot operator to call the method.
        Bank Andrew = new Bank("Andrew", 75000);
        Andrew.checkBalance();               
    }
}