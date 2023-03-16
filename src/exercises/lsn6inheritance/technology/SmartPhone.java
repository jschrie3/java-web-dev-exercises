package exercises.lsn6inheritance.technology;

public class SmartPhone extends Computer {
    // TODO: For a child class add at least 1 additional property and 1 additional method.

    /* Properties (1) */
    private boolean isIphone;

    // subclass does not inherit constructor from Computer unless we use super keyword
    public SmartPhone (boolean isIphone, String operatingSystem,boolean isPortable, boolean hasToBePluggedIn, double weight) {
        super(operatingSystem,isPortable, hasToBePluggedIn, weight); // super must be at the top of the subclass constructor
        this.isIphone = isIphone;
    }
    /* Methods (1) */
    // if a SmartPhone is an iPhone, the operatingSystem is Apple
    public void iPhone(){
        if (isIphone) {
            setOperatingSystem("Apple");
        } else if (!isIphone) {
            setOperatingSystem("Google");
        }
    }
}
