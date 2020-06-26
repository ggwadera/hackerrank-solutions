/**
 * DAY 5/30
 * Loops
 * https://www.hackerrank.com/challenges/30-loops/
 */

package com.thirtydaysofcode.solutions;

import java.util.Scanner;

public class Loops {

    private static final Scanner scanner = new Scanner(System.in);

    private static void printMultiples(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.close();
        printMultiples(n);
    }

}
