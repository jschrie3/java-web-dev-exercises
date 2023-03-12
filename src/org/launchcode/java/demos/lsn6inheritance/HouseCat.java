package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    // TODO: Now, we can initialize a new HouseCat with only a name
    //  property and the Cat no-argument constructor will still be applied.
    public HouseCat(String aName) {
        name = aName;
    } // the no-arg constructor (weight = 13) is implicitly called from Cat (the base class)

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override // this method of HouseCat overrides the method of the same name in Cat
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    // TODO: looking at super and overrides
//    @Override // this method of HouseCat overrides the method of the same name in Cat
//    public String noise() {
//        if (isSatisfied()) {
//            return "Hello, my name is " + name + "!";
//        } else { // you can still call the base class method for noise()
//            return super.noise(); // super allows us to use original base method to print meow
//        }
//    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
