// variables
public class Variables {
    public static void main(String[] args) {
        // int is the whole number, int is primitive type, int don't store fractions or decimals
        // int is the keyword we write before the name of the variable
        int age = 30;
        System.out.println(age);

        /* doubles */
        // double is a primitive data type, it can hold decimals as well as very large and very small numbers.
        // to declare double write the keyword double in front of the variable name
        double salaryPerHour = 50.50;
        System.out.println(salaryPerHour);

        /* booleans */
        // is the data type that references one or two values: true or false
        // to declare boolean write a keyword in front of the variable
        boolean hasCoffee = false;
        System.out.println(hasCoffee);

        /* char */
        // the char data type can hold any character, like a letter, space, or punctuation mark
        // it must be surrounded by single quotes ''.
        char firstLetter = 'J';

        /* String */
        // Our programs will use strings, Strings are objects, instead of primitives. Object have built-in behavior.
        // Strings hold sequences of characters.
        // There are two ways to create a String object: using a String literal or calling the String class to create a new String object.
        /* A String literal is any sequence of characters enclosed in double quotes "". Like primitive data types we declare a String variable
        by specifying the type first: */
        String greeting = "Hello World";
        // We could also create a new String object by calling the String class when declaring a String like so:
        String salutations = new String("Hello World");
        /* There are subtle differences in behavior depending on whether you create a String using a String literal or a new String object. 
        We’ll dive into those later, but for now, we’ll almost always be using String literals. 
        */
       
        // Certain symbols, known as escape sequences, have an alternative use in Java print statements.
        // Escape characters begin with the character \. 
        // There are three escape sequences to be aware of for the AP exam.
        // The \" escape sequence allows us to add quotation marks " to a String value. :
        System.out.println("\"Hello World \""); // <- Prints "Hello World"
        // If we didn’t use an escape sequence, then Java would think we’re using " to end the String!

        // Using the \\ escape sequence allows us to place backslashes in our String text:
        System.out.println("This is the backlash symbol: \\");

        // Finally, if we place a \n escape sequence in a String, the compiler will output a new line of text:

        System.out.println("Hello\nGoodbye");
        /*
        Prints:
        Hello
        Goodbye
        */
        // You can think of \n as the escape sequence for “newline”.
        String name = "John";
        System.out.println(name);
    }
}