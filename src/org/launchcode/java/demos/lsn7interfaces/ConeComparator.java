package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone cone1, Cone cone2) {
        if (cone1.getCost() - cone2.getCost() < 0) { // if cone2 is more expensive
            return -1;
        } else if (cone1.getCost() - cone2.getCost() > 0) { // if cone1 is more expensive
            return 1;
        } else {
            return 0;
        }
    }
}
