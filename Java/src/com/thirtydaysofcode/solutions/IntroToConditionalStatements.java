/**
 * DAY 3/30
 * Intro to Conditional Statements
 * https://www.hackerrank.com/challenges/30-conditional-statements/
 */

package com.thirtydaysofcode.solutions;

import java.util.Scanner;

public class IntroToConditionalStatements {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
