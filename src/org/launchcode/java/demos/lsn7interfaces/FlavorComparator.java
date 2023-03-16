package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

// TODO: CREATE A SORTING CLASS
public class FlavorComparator implements Comparator<Flavor> {
    // when flagged, select implement methods > select compare
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) { // compares two flavor objects and returns 0
//        return 0; // we want to sort the flavors
        // this compares options 1 and 2
        return flavor1.getName().compareTo(flavor2.getName());
        // returns an integer (negative, positive, or zero) depending on whether
        // Flavor object o1 or o2 comes first, alphabetically
    }
}
