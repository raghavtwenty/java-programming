/*
Filename: _0019_nested_loop.java
Title: Nested loop
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 19, 2024 | Last Updated: October 19, 2024
Language: Java
*/

public class NestedLoop {
    // Main method
    public static void main(String[] args) {
        // nested for loop
        // for loop - initial value, stop value, step value
        for (int i = 1; i <= 3; i++) { // outer loop
            for (int j = 1; j <= 2; j++) { // inner loop
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
