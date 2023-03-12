package org.launchcode.java.demos.lsn6inheritance;

// TODO: 7.4.1: We could prevent objects of type Cat from being created, while still enabling sharing of behavior
//  among its subclasses, by making Cat an abstract class.
// add abstract to the signature of cat
public abstract class Cat {
    // properties (fields) of Cat class
    private boolean tired = false;
    private boolean hungry = false;
    private double weight;

    // The biological family for all cat species
    // This field is not directly accessible by HouseCat since it is private.
    // However, it may be read via the public getter getFamily.
    private String family = "Felidae";

    public Cat (double aWeight) {
        weight = aWeight;
    }

    // super and no-argument constructors
    // TODO 7.3.2: we can add an additional constructor in Cat
    public Cat (){
        weight = 13;
    }
    // Even though we don’t explicitly specify that we want to call a constructor from
    // Cat, the no-argument constructor will be called in HouseCat.



    /**** Getters and Setters ****/

    public boolean isTired() {
        return tired;
    }

    public void setTired(boolean aTired) {
        tired = aTired;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean aHungry) {
        hungry = aHungry;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double aWeight) {
        weight = aWeight;
    }

    // there is not a setter for family - the family should only be able to be set in the Cat class
    // because the biological family of a Cat should not change, therefore it
    // should not be able to be changed by a subclass of Cat
    public String getFamily() {
        return family;
    }

    /**** Instance Methods ****/

    // A cat is rested and hungry after it sleeps
    public void sleep() {
        tired = false;
        hungry = true;
    }

    // Eating makes a cat not hungry
    public void eat() {

        // eating when not hungry makes a cat sleepy
        if (!hungry) {
            tired = true;
        }

        hungry = false;
    }

    // TODO: 7.4.2: In our abstract Cat class, it would make sense to make an abstract noise
    //  method since all types of cats make noise. By creating this abstract method, we force
    //  any class that extends Cat to provide its own implementation of that behavior.
    public String noise() {
        return "Meeeeeeooooowww!";
    }
}
