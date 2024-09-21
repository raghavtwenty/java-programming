/*
Filename: _0003_datatypes.java
Title: Basic datatypes in Java
Author: Raghava | GitHub: @raghavtwenty
Date Created: September 21, 2024 | Last Updated: September 21, 2024
Language: Java
*/

// Required imports
import java.util.*;

public class BasicDatatypes {

    // Main function
    public static void main(String[] args) {

        // \n - separator
        // %  - Format specifiers
        
        // Integer data type (4 bytes)
        int a = 10;
        System.out.printf("Integer: %d\n", a);

        // Character data type (2 bytes in Java, supports Unicode)
        char b = 'A';
        System.out.printf("Character: %c\n", b);

        // Floating point data type (4 bytes)
        float c = 3.14f;
        System.out.printf("Float: %.2f\n", c);

        // Double precision floating point data type (8 bytes)
        double d = 3.1415926535;
        System.out.printf("Double: %.10f\n", d);

        // Short integer data type (2 bytes)
        short e = 32767;
        System.out.printf("Short: %d\n", e);

        // Long integer data type (8 bytes in Java)
        long f = 1234567890L;
        System.out.printf("Long: %d\n", f);

        // Long long integer (Java uses long as 8 bytes, equivalent to C's long long)
        long g = 123456789012345L;
        System.out.printf("Long Long: %d\n", g);

        // Unsigned char equivalent (cast to int for display as Java treats char as 16-bit Unicode)
        int i = (char) 255;
        System.out.printf("Unsigned Char (displayed as int): %d\n", i);

    }
}
