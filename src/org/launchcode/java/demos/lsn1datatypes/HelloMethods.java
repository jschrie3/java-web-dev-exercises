package org.launchcode.java.demos.lsn1datatypes;

public class HelloMethods {

    public static void main(String[] args) { // establish main method
        // public means the method can be called in other classes
        // static means the method is not attached to a specific instance of the class
        // which means this method can be used without creating an object
        // void is the return type and means no value is returned

        // call in getMessage method from Message class
        // since getMessage is a static method, we have to put the class name
        // Message in front of the method name: ClassName.methodName(arguments)
        String message = Message.getMessage("fr"); // "fr" returns french greeting
        System.out.println(message); // print message specified by getMessage
    }

}
