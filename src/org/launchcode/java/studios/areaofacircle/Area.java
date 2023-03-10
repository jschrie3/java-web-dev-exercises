package org.launchcode.java.studios.areaofacircle;
// import Scanner so we can take input
import java.sql.SQLOutput;
import java.util.Scanner;

import static org.launchcode.java.studios.areaofacircle.Circle.getArea;

public class Area {
    // in order to execute code from this class, we need a main method
    public static void main(String[] args) {
        //create new instance of Scanner object called input
        Scanner input = new Scanner (System.in);
        // prompt user for input
        System.out.println("Enter a radius: ");
        // BONUS MISSION: add validation
        // if the input is NOT a double, then print error message
        if (!input.hasNextDouble()){
            System.out.println("The radius must be a valid number.");
            // use a return to prevent exception from being thrown and quit
            return;
        }
        // declare and initialize radius as a double
        // next value that comes back from prompt as a double will be stored as radius
        double radius = input.nextDouble();
        // declare pi as a constant
        double PI = 3.14159265359;
        // declare and initialize the area variable
        // double area = PI * radius * radius;
        // use the Circle class and getArea method to find area; pass in radius
        double area = Circle.getArea(radius);
        // use scanner method to print user results
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
