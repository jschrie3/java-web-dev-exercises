package exercises.lsn3classes1;

import java.util.ArrayList;

public class ArrayListPracticeTest {
    public static void main(String[] args) {
        // TODO: Write a static method to find the sum of all the even numbers in an ArrayList. Within main, create a list with at least 10 integers and call your method on the list.
        // create an array list with at least 10 integers
        ArrayList<Integer> numbers = new ArrayList<>();
        // populate the arraylist using .add method
        numbers.add(1);
        numbers.add(23);
        numbers.add(14);
        numbers.add(12);
        numbers.add(35);
        numbers.add(67);
        numbers.add(89);
        numbers.add(40);
        numbers.add(42);
        numbers.add(56);
        numbers.add(87);
        numbers.add(96);
        // print array list
        System.out.println(numbers);
        // run the static method on the arraylist and print
        System.out.println(ArrayListPractice.sumEven(numbers));
    }
}
