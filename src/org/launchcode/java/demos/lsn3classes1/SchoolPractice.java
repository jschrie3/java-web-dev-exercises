package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        // TODO 2: Instantiate the Student class using yourself as the student.
        //  For the numberOfCredits give yourself 1 for this class and a GPA of 4.0
        // instantiate a new object of student class with myself
        Student julian = new Student();
        julian.setName("Julian");
        julian.setStudentId(88503);
        julian.setNumberOfCredits(1); // give myself 1 credit
        julian.setGpa(4.0); // give myself a 4.0 gpa
    }
}
