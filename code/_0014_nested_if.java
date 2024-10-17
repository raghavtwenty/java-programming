/*
Filename: _0014_nested_if.java
Title: Nested If Condition
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 17, 2024 | Last Updated: October 17, 2024
Language: Java
*/

public class NestedIfCondition {
    public static void main(String[] args) {
        int num = 15;

        // Outer if statement
        if (num > 0) {
            // If outer statement is true, then inside if checks
            if (num % 2 == 0) {
                System.out.println("The number is positive and even.");
            // inside else
            } else {
                System.out.println("The number is positive and odd.");
            }
        }
    }
}
