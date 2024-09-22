/*
Filename: _0005_char_num.java
Title: Character from number
Author: Raghava | GitHub: @raghavtwenty
Date Created: September 22, 2024 | Last Updated: September 22, 2024
Language: Java 
*/


public class _0005_char_num {
    public static void main(String[] args) {
        // Initialize n with the ASCII value 65 which corresponds to 'A'
        char n = 65;

        // Convert the integer to a character and print it
        System.out.println("Integer as character: " + n);
        
        // Additionally, you can convert a character back to its ASCII value
        int asciiValue = n;
        System.out.println("Character 'A' as integer: " + asciiValue);
    }
}