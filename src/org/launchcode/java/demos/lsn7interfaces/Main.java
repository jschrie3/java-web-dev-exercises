package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

// TODO: SORTING THE FLAVORS ARRAYLIST
public class Main {
    public static void main(String[] args){
        // declare menu for ice cream case
        Case menu = new Case(); // contains all flavors in the case
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        // create a new FlavorComparator object
        FlavorComparator flavorComparator = new FlavorComparator();
        //  call the sort method on flavors and pass the comparator object as the argument
        flavors.sort(flavorComparator);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        // create a new ConeComparator object
        ConeComparator coneComparator = new ConeComparator();
        //  call the sort method on flavors and pass the comparator object as the argument
        cones.sort(coneComparator);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("SORTED FLAVORS:");
        for (Flavor flavor : flavors) { // for each flavor in the flavors arraylist
            System.out.println(flavor.getName()); // print just the name of each flavor
        }

        System.out.println("\nSORTED PRICES:");
        for (Cone cone : cones) { // for each cone in the cones arraylist
            System.out.println("$" + cone.getCost()); // print just the price of each cone
        }
    }
}
