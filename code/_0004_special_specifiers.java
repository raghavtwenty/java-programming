/*
Filename: _0004_special_specifiers.java
Title: Special specifiers
Author: Raghava | GitHub: @raghavtwenty
Date Created: September 22, 2024 | Last Updated: September 22, 2024
Language: Java 
*/

public class _0004_special_specifiers {
    public static void main(String[] args) {
        // Using \n to create a newline
        System.out.printf("Hello, World!\n");
        
        // Using \\ to insert a backslash
        System.out.printf("This is a backslash: \\\n");
        
        // Using \t to insert a horizontal tab
        System.out.printf("Column1\tColumn2\tColumn3\n");
        
        // Using \" to insert double quotes
        System.out.printf("He said, \"Hello!\"\n");
        
        // Using \' to insert single quotes
        System.out.printf("It's a beautiful day!\n");
        
        // Using \0 to mark the end of a string (Java doesn't handle null characters the same way as C)
        // Strings in Java are not null-terminated, so no need to manually insert \0
        String str = "This is a string\0 with more text that will not be printed.";
        System.out.println(str);  // Java will print the entire string, ignoring the \0
        
        // stop at the null character manually
        System.out.println(str.split("\0")[0]);  // Only prints up to the null character
    }
}
