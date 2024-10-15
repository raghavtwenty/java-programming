/*
Filename: _0008_logical_operators.java
Title: Logical operators
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 15, 2024 | Last Updated: October 15, 2024
Language: Java 
*/

// Main class
public class LogicalOperators {

    // Main method
    public static void main(String[] args) {
        int a = 1; // true
        int b = 0; // false
        
        // Logical AND (&&)
        if (a != 0 && b != 0) {
            System.out.println("Logical AND: a && b is true");
        } else {
            System.out.println("Logical AND: a && b is false");
        }
        
        // Logical OR (||)
        if (a != 0 || b != 0) {
            System.out.println("Logical OR: a || b is true");
        } else {
            System.out.println("Logical OR: a || b is false");
        }
        
        // Logical NOT (!)
        if (a == 0) {
            System.out.println("Logical NOT: !a is true");
        } else {
            System.out.println("Logical NOT: !a is false");
        }
        
        if (b == 0) {
            System.out.println("Logical NOT: !b is true");
        } else {
            System.out.println("Logical NOT: !b is false");
        }

        // Demonstrating with additional variables
        int x = 5;
        int y = 10;
        int z = 0;

        // Logical AND (&&)
        if (x > 0 && y > 0) {
            System.out.println("Logical AND: x > 0 && y > 0 is true");
        } else {
            System.out.println("Logical AND: x > 0 && y > 0 is false");
        }
        
        // Logical OR (||)
        if (x > 0 || z > 0) {
            System.out.println("Logical OR: x > 0 || z > 0 is true");
        } else {
            System.out.println("Logical OR: x > 0 || z > 0 is false");
        }
        
        // Logical NOT (!)
        if (!(x < 0)) {
            System.out.println("Logical NOT: !(x < 0) is true");
        } else {
            System.out.println("Logical NOT: !(x < 0) is false");
        }
        
        if (!(y < 0)) {
            System.out.println("Logical NOT: !(y < 0) is true");
        } else {
            System.out.println("Logical NOT: !(y < 0) is false");
        }
    }
}
