/*
Filename: _0016_ternary_operators.java
Title: Ternary Operators
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 18, 2024 | Last Updated: October 18, 2024
Language: Java
*/

public class TernaryOperators {
    public static void main(String[] args) {
        // Variable initialization
        int num = 20;
        String result; // No pointers in Java, so directly use String

        // Ternary operation: If num > 0 is true, the first string is assigned, otherwise the second string
        result = (num > 0) ? "The number is positive." : "The number is non-positive.";

        // Output result
        System.out.println(result);
    }
}
