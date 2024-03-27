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
    
    }
}