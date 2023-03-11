package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {
// declare instance variables
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // TODO 1: add all of the necessary getters and setters.
    // add getter and setter pairs for each variable (right-click > generate > getters and setters)
    public String getName() { // getter for name
        return name;
    }
    public void setName(String name) { //setter for name
        this.name = name;
    }
    public int getStudentId() { // getter for student id
        return studentId;
    }
    public void setStudentId(int studentId) { // setter for student id
        this.studentId = studentId;
    }
    public int getNumberOfCredits() { //getter for credits
        return numberOfCredits;
    }
    public void setNumberOfCredits(int numberOfCredits) { // setter for credits
        this.numberOfCredits = numberOfCredits;
    }
    public double getGpa() { // getter for gpa
        return gpa;
    }
    // TODO 1: try reducing the access level of at least one setter to less than public.
    // reducing the access level of gpa to package-private so it can be used in main method
    void setGpa(double gpa) { // setter for gpa
        this.gpa = gpa;
    }
}