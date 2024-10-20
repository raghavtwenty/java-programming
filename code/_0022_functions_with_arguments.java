/*
Filename: _0022_functions_with_arguments.java
Title: Functions with Arguments in Java
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 20, 2024 | Last Updated: October 20, 2024
Language: Java
*/

public class FunctionsWithArguments {

    // Function with arguments and no return value
    public static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Function with arguments and return value
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Function with an array argument and no return value
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function with an array argument and return value
    public static int findMaxInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {

        printSum(5, 10); // With arguments, no return value

        int product = multiply(4, 7); // With arguments, with return value
        System.out.println("Product: " + product);

        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr); // Array argument, no return value

        int maxInArray = findMaxInArray(arr); // Array argument, with return value
        System.out.println("Max in array: " + maxInArray);
    }
}
