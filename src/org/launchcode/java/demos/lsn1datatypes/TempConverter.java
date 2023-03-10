// declare the package where the file resides
package org.launchcode.java.demos.lsn1datatypes;
// import statement to access class and methods
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // must declare data type for any variable
        double fahrenheit;
        double celsius;
        // declare input variable
        Scanner input;

        // initialize input variable to hold user input
        // use "new" to create an instance of Scanner, call constructor
        // pass the constructor the System.in object
        input = new Scanner(System.in);
        // ask the user for input
        System.out.println("Enter the temperature in Fahrenheit: ");
        // use input and Scanner method to read value from command line
        // nextDouble() returns the next item to read as a double data type
        fahrenheit = input.nextDouble();
        // close Scanner object
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
