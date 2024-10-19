/*
Filename: _0020_break.java
Title: Break statements in Java
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 19, 2024 | Last Updated: October 19, 2024
Language: Java | Version: Java 17
*/

public class BreakExample {
    // Main method
    public static void main(String[] args) {
        // For loop 
        // start, end, step
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
            System.out.println("i: " + i);
        }

        // Final Show
        System.out.println("Loop terminated.");
    }
}
