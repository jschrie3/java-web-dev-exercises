package exercises.lsn6inheritance.technology;

public class Laptop extends Computer {
    // TODO: For a child class add at least 1 additional property and 1 additional method.

    /* Properties (1) */
    private boolean isMac;

    // subclass does not inherit constructor from Computer unless we use super keyword
    public Laptop (boolean isMac, String operatingSystem,boolean isPortable, boolean hasToBePluggedIn, double weight) {
        super(operatingSystem,isPortable, hasToBePluggedIn, weight) // super must be at the top of the subclass constructor
        this.isMac = isMac;
    }

    /* Methods (1) */
    // if a laptop is a Mac, the operatingSystem is Apple
    public void macbook(){
        if (isMac) {
            setOperatingSystem("Apple");
        } else if (!isMac) {
            setOperatingSystem("Microsoft");
        }
    }

}
