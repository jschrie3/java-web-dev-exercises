package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    // establish main method
    public static void main(String[] args) {
        // declare and initialize the quote we will use
        // String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        // TODO: BONUS MISSION
        // TODO: Prompt the user to enter the string in the command line.
        // create a scanner object to hold user input
        Scanner input = new Scanner(System.in);
        // prompt the user
        System.out.println("Please enter a string to count its characters: ");
        // receive user input and store it
        String userString = input.nextLine();

        // TODO: BONUS MISSION
        // TODO: Exclude non-alphabetic characters.
        // create a string that contains the alphabet in uppercase to use as reference
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create an array of characters and convert quote
//        char[] quoteCharArray = quote.toCharArray();

        // TODO: BONUS MISSION
        // TODO: Make the character counts case-insensitive.
        // convert the string to all uppercase with method chaining
        char[] CharArray = userString.toUpperCase().toCharArray();
        // create the hashmap we will add our key/value pairs to
        HashMap<Character, Integer> counts = new HashMap<>();
        // loop through the array
        // for each letter in the quoteCharArray
//        for (char letter : quoteCharArray) {
        for (char letter : CharArray) {
            // TODO: BONUS MISSION (cont.)
            // in the bonus mission, we are nesting the if (counts.containsKey(letter))
            // within a new conditional that determines whether the character
            // is in the alphabet string before counting it as a way to exclude
            // spaces and other punctuation
            // if string alphabet has an index for the letter
            // (meaning the letter is at index 0 or above)
            // then loop through and count the characters
            if (alphabet.indexOf(letter) >= 0) {
                // if the hashmap (counts) contains the letter as a key
                if (counts.containsKey(letter)) {
                    // count the letters:
                    // use .put to add + 1 to the counter where
                    // .get retrieves the value at that key (letter)
                    // then adds 1 each time the letter is encountered
                    counts.put(letter, counts.get(letter) + 1);
                } else {
                    // if the letter does not already exist in the map,
                    // .put establishes the letter as a key and gives it a value of 1
                    // because it is the first instance of the letter
                    counts.put(letter, 1);
                }
            }
        }
        // loop through the entries of the hashmap we created
        // Map.Entry is used to represent key/value pairs within HashMaps
        // Map.Entry<Character, Integer> sets the type for key/value pair (count)
        // which is one of the key/value pairs we are looping through from
        // the set of key/value pairs in the hashmap (counts)
        for (Map.Entry<Character, Integer> count : counts.entrySet()){
            // print key/value pairs using Map.Entry object methods:
            // getKey represents the key in the Map.Entry object
            // getValue represents the value in the Map.Entry object
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}
