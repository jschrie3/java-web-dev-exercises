package exercises.lsn3classes1;

import java.util.ArrayList;

public class ArrayListPractice {
    // TODO: Write a static method to find the sum of all the even numbers in an ArrayList. Within main, create a list with at least 10 integers and call your method on the list.
    // create a public static method that returns an integer
    public static int sumEven(ArrayList<Integer> arr) { // takes in array as argument
        // start a counter at 0 for the sum (total)
        int total = 0;
        // use a for loop to return only even numbers
        for (int integer : arr) { // for each integer in arraylist (arr)
            if (integer % 2 == 0) { // if integer % 2 returns 0 (aka if the integer divided by 2 returns no remainder)
                total += integer; // then return the integer and add it to total
            }
        }
        return total; // the method should return just the sum (total)
    }
}
