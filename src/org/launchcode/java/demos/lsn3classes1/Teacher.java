package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    // TODO 4: In the school package, create a class Teacher with four fields:
    //  firstName, lastName, subject, and yearsTeaching.
    // declare four fields
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    // TODO 4: Add getters and setters to the class and add the access level to each field and method in the class.
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getYearsTeaching() {
        return yearsTeaching;
    }
    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
