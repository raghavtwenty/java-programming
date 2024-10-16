/*
Filename: _0009_bitwise_operators.java
Title: Bitwise operators
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 16, 2024 | Last Updated: October 16, 2024
Language: Java
*/

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // 5 in binary is 00000101
        int b = 9;  // 9 in binary is 00001001

        // Bitwise AND (&)
        System.out.println("Bitwise AND: " + a + " & " + b + " = " + (a & b)); // 00000101 & 00001001 = 00000001 (1)

        // Bitwise OR (|)
        System.out.println("Bitwise OR: " + a + " | " + b + " = " + (a | b)); // 00000101 | 00001001 = 00001101 (13)

        // Bitwise XOR (^)
        System.out.println("Bitwise XOR: " + a + " ^ " + b + " = " + (a ^ b)); // 00000101 ^ 00001001 = 00001100 (12)

        // Bitwise NOT (~)
        System.out.println("Bitwise NOT: ~" + a + " = " + ~a); // ~00000101 = 11111010 (in 32-bit two's complement, -6)

        // Left Shift (<<)
        System.out.println("Left Shift: " + a + " << 1 = " + (a << 1)); // 00000101 << 1 = 00001010 (10)
        System.out.println("Left Shift: " + a + " << 2 = " + (a << 2)); // 00000101 << 2 = 00010100 (20)

        // Right Shift (>>)
        System.out.println("Right Shift: " + b + " >> 1 = " + (b >> 1)); // 00001001 >> 1 = 00000100 (4)
        System.out.println("Right Shift: " + b + " >> 2 = " + (b >> 2)); // 00001001 >> 2 = 00000010 (2)
    }
}
