/*
Filename: _0025_arrays_with_characters.java
Title: Arrays with characters in Java
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 21, 2024 | Last Updated: October 21, 2024
Language: Java 
*/

// Main class
public class ArraysWithCharacters {

    // Main method
    public static void main(String[] args) {
        // Declaration and initialization of a string
        char[] str = {'H', 'e', 'l', 'l', 'o'};

        // Accessing string elements
        for (int i = 0; i < str.length; i++) {
            System.out.println("str[" + i + "] = " + str[i]);
        }

        // Printing the string using the character array
        String result = new String(str);
        System.out.println("String: " + result);
    }
}
