/*
Filename: _0021_unctions.java
Title: Functions in Java
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 20, 2024 | Last Updated: October 20, 2024
Language: Java 
*/

// Required imports
public class Functions {
    
    // Function with no arguments and no return value
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // Function with no arguments but with return value
    public static int getTen() {
        return 10;
    }

    // Main method
    public static void main(String[] args) {
        greet(); // No argument, no return value

        int ten = getTen(); // No argument, with return value
        System.out.println("getTen returned: " + ten);
    }
}
