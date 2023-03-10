// declare package
package exercises.lsn1datatypes;
// add an import statement to include Scanner class and methods
import java.util.Scanner;

public class AreaRectangle {
    // establish main method
    public static void main(String[] args) {
        // add a Scanner object to handle the user’s input
        Scanner length = new Scanner(System.in);
        // add a print line to prompt the user for
        // the length of the rectangle
        System.out.println("Please enter rectangle length:");
        // define a variable to handle the user’s response.
        // Now is the time to know what type the dimension will be
        Double lengthRectangle  = length.nextDouble();

        // repeat the previous two steps to ask for and store the
        // rectangle’s width.
        Scanner width = new Scanner(System.in);
        System.out.println("Please enter rectangle width:");
        Double widthRectangle  = width.nextDouble();

        // use  the length and width values to calculate the
        // rectangle’s area.
        Double area = lengthRectangle *  widthRectangle;
        // print a statement using concatenation to communicate to
        // the user what the area of their rectangle is.
        System.out.println("The area of this rectangle  is: " + area);
    }
}
