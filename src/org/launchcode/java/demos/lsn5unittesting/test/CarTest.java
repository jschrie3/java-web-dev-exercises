package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarTest {

    // add a BEFORE annotation so we don't have to create a new instance of Car for each test
    Car test_car; // declare test_car object
    @Before // used to set up some data or a condition that you want to have for every test in a given class
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10 ,50);
    }

    //TODO: add emptyTest so we can configure our runtime environment
    // (remove this test before pushing to your personal GitLab account)
    @Test // annotates the method to signal it as a test case
    public void emptyTest() {
        // This empty test is simply asserting an expected value of 10 to equal an
        // actual value of 10, with an accepted .001 variance.
        assertEquals(10,10,.001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        // initialize a new car object to test that constructor handles gasTankLevel properly
//        Car test_car = new Car("Toyota", "Prius", 10 ,50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50); // use the Car method drive()
        assertEquals(9, test_car.getGasTankLevel(), .001); // With a value of 50 miles passed into drive(), we expect test_car to have a gasTankLevel of 9.
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(1000); // since tank holds 10 gallons and the mpg is 50, I chose a number that would definitely drain the tank
        assertEquals(0, test_car.getGasTankLevel(), .001); // gas tank should be empty
    }


    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class) // this test should pass if an IllegalArgumentException is thrown at any point during this test
    public void testGasOverfillException() {
        // implement the new addGas() method and a fail() scenario.
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }



}
