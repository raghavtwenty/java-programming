/*
Filename: _0013_if_else_elif.java
Title: If-ElseIf Condition
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 17, 2024 | Last Updated: October 17, 2024
Language: Java 
*/

public class IfElseIfCondition {
    public static void main(String[] args) {
        int num = 0;

        // If statement true
        if (num > 0) {
            System.out.println("The number is positive.");
        // Looks for other condition check
        } else if (num < 0) {
            System.out.println("The number is negative.");
        // else should be the final in if-else if
        } else {
            System.out.println("The number is zero.");
        }
    }
}
