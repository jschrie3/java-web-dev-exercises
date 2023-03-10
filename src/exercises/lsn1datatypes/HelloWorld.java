// declare package
package exercises.lsn1datatypes;
// add an import statement to include Scanner class and methods
import java.util.Scanner;


public class HelloWorld {

    public static void main(String[] args) {
        // declare a variable of type Scanner called "input"
        Scanner input = new Scanner(System.in);
        // add a question to ask the user
        System.out.println("Hello, what is your name:");

        // create a variable to  store the user's response using
        // the .nextline() method
        String name = input.nextLine();
        // use concatenation to print greeting
        System.out.println("Hello " + name);
    }
}
