package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) { // create method getMessage
        // public means the method can be called in other classes
        // static means the method is not attached to a specific instance of the class
        // this class does not have a main method so it cannot be run on its own
        // getMessage has a return type of String rather than void
        // this method takes in "lang" (a string) as the parameter
        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else {
            return "Hello, World!";
        }
    }
}
