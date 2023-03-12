package exercises.lsn6inheritance.technology;

public class Computer {
    // TODO: For a parent class add 3 properties, 2 methods, and a constructor.

    /* Properties (3) */
    private String operatingSystem;
    private boolean isPortable;
    private boolean hasToBePluggedIn;
    private double weight;

    /* Constructors (1) */
    public Computer(String operatingSystem,boolean isPortable, boolean hasToBePluggedIn, double weight) {
        this.operatingSystem = operatingSystem;
        this.isPortable = isPortable;
        this.hasToBePluggedIn = hasToBePluggedIn;
        this.weight = weight;
    }

    /* Methods (2) */
    // if a computer has to be plugged in to work, it could be a desktop
    public void desktop() {
       if (hasToBePluggedIn){
           isPortable = false;
       } else if (!hasToBePluggedIn) {
           isPortable = true;
        }
    }

    // if a computer weighs less than 5 lbs, it is portable
    public void portableComputer() {
        if (weight < 5.0) {
            isPortable = true;
        }
    }

    /* Getters and Setters */

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isPortable() {
        return isPortable;
    }

    public void setPortable(boolean portable) {
        isPortable = portable;
    }

    public boolean isHasToBePluggedIn() {
        return hasToBePluggedIn;
    }

    public void setHasToBePluggedIn(boolean hasToBePluggedIn) {
        this.hasToBePluggedIn = hasToBePluggedIn;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
