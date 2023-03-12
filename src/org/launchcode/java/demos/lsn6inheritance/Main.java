package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        // write an instance of HouseCat and call some of the methods it inherits from Cat.
        HouseCat kitty = new HouseCat("Kitty", 12);
        // The eat method was defined in Cat, but may be called on all HouseCat instances as well.
        kitty.eat(); // We say: “HouseCat inherits the method eat() from Cat.”
        System.out.println(kitty.isTired()); // if it prints true, we know the cat ate and is now tired

        // you can confirm that the base class constructor (weight = 13) has been called by initializing
        // a new HouseCat with only the name property
        HouseCat spike = new HouseCat("Spike");
        // if the base class no-arg constructor is really called, the weight should default to 13
        System.out.println(spike.getWeight()); // prints 13

        // If we have a HouseCat object and call its noise() method, we will be using the method
        // defined in HouseCat.
        Cat plainCat = new HouseCat("Cat",8.6); // when we made the class abstract, this created an error here
        HouseCat cheshireCat = new HouseCat("Chester", 12);
        // now we can compare the responses when calling the noise() method on the main class and
        // subclass where we override the Cat method for noise()
        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Chester!"
    }
}
