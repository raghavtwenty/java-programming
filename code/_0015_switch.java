/*
Filename: _0015_switch.java
Title: Switch Statements
Author: Raghava | GitHub: @raghavtwenty
Date Created: October 18, 2024 | Last Updated: October 18, 2024
Language: Java
*/

public class SwitchStatements {
    public static void main(String[] args) {
        // Variable initialization
        int day = 3;

        // Takes the variable
        switch (day) {
            // Checks if day variable == 1
            case 1:
                System.out.println("Monday");
                // Break statements are necessary in switch case only then it exits out of switch case
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
