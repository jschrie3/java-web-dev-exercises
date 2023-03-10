package exercises.lsn3classes1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        // TODO: It takes in student names and ID numbers (as integers) instead of names and grades.
        // declare and initialize the hashmap
        HashMap<String, Integer> students = new HashMap<>();
        // create a scanner object to store user input
        Scanner input = new Scanner(System.in);
        // declare variable to hold student name input
        String studentName;
        // prompt user for input
        System.out.println("Enter your students name: ");

        // handle the user input
        do {
            // tell user to input name
            System.out.println("Student Name: ");
            // take in the next string as the student's name
            studentName = input.nextLine();

            // if the user does NOT enter a blank
            if (!studentName.equals("")) {
                // then prompt for ID
                System.out.println("ID Number: ");
                // take in the next integer as ID
                int studentID = input.nextInt();
                // TODO: The keys should be the IDs and the values should be the names.
                // add the key/value pairs to hashmap
                students.put(studentName, studentID);

                // read in next line before looping back
                input.nextLine();
            }
            // continue looping, so long as user does not enter a blank
        } while (!studentName.equals(""));

        // TODO: Modify the roster printing code accordingly.
        // print the class roster
        System.out.println("\nClass roster:");
        // for each entry in the hashmap
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + ", (ID: " + student.getValue() + ")");
        }
    }
}
