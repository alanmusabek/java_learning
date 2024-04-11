/* manipulating variables */
public class LectureTwo {
    public static void(String[] args) {
        // We can use expressions, arithmetic operators, and more in order to change our variable's value
        // For example, Java has built-in arithmetic operations that perform calculations on numeric values:
        double balance = 20000.99;
        double depositAmount = 1000.00;
        balance = balance + depositAmount;
        
        // if want to withdraw we can '-' operator
        double withdrawAmount = 500;
        balance = balance - withdrawAmount;

        int numPictureOfCats = 60 + 24;

        // variable++ <- increases the value by 1
        numPictureOfCats++;

        // variable-- <- decreases the value by 1
        numPictureOfCats--;

        /* multiplication and division */
        // multiplication operator *
        double paycheckAmount = 40 * 15.00;

        // division operator /
        double balance = 20010.5;
        double hourlyRate = 15.5;
        double hourseWorked = balance / hourlyRate;

        // Division has different results with integers. The '/' operator does integer division, which means that any remainder is lost.
        int evenlyDivided = 10 / 5; // <-- holds 2
        int unevenlyDivided = 10 / 4; // <-- holds 2

        // if divide any number by 0 it will show ArithmeticExpression error

        /* modulo */
        // the module operator %, gives us the remainder after two numbers divided.
        int cookiesBaked = 10;
        int cookiesLeftover = 10 % 3; // <-- holds 1.

        // Compound Assignment Operators
        // We can shorten syntax by using compound assignment operators
        // They perform an arithmetic operation on a variable and then reassigns its value
        // Using the += compound operator we can rewrite previous code like so:
        balance = balance + withdrawAmount; // <- long version
        balance += withdrawAmount; // <- short version

        // We can use CAO for all the arithmetic operators we've covered:
        balance -= withdrawAmount;
        balance += withdrawAmount;
        balance *= withdrawAmount;
        balance /= withdrawAmount;
        balance %= withdrawAmount;

        // .equals()
        // So far we used operations on primitive types
        // What if we had two users logging into a site, and we wanted to see if their usernames are the same?
        // With objects, such as Strings, we can't use the primitive equality operator.
        // To test equality with with objects, we use a built-in method called .equals()
        // When comparing objects, make sure to always use .equals(), == will work occasionally, but the reason why it
        // sometimes works has to do with how objects are stored in memory.

        // To use it, we call it on one String, by using . and pass in the String to compare against in parentheses:
        String person1 = "Paul";
        String person2 = "Peter";
        String person3 = "Paul";

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

        /* final keyword*/
        // To declare a variable with a value that cannot be manipulated, we need to use tbe final keyword.
        // To use the final keyword, prepend final to a variable declaration like so:
        final int yearBorn = 1990;
        // Trying to change the value of the variable with final keyword will cause an error.
        
    }
}