package exercises.lsn3classes1;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // TODO: Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
        int[] intArray = {1, 1, 2, 3, 5, 8};
        // TODO: Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        for (int i : intArray) { // for each integer (i) in intArray
            System.out.println(i); // print the integer (i)
        }
        // TODO: For this exercise, use the string I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. Use the split method to divide the string at each space and store the individual words in an array. If you need to review the method syntax, look back at the String methods table.
        // declare and initialize the quote
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        // create and array with string and split out each word using space as a delimiter
//        String[] words = quote.split(" ");
        // TODO: Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences.
        // split sentences using "." as the delimiter
        // "." is a special character in this context, so we have to use "\\."
        String[] words = quote.split("\\.");
        // TODO: Print the array of words to verify that your code works.
        // print out individual words and store the words in an array
        System.out.println(Arrays.toString(words));
    }
}
