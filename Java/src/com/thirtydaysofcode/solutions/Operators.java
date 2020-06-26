/**
 * DAY 2/30
 * Operators
 * https://www.hackerrank.com/challenges/30-operators/
 */

package com.thirtydaysofcode.solutions;

import java.util.Scanner;

public class Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        float tip = tip_percent / 100f;
        float tax = tax_percent / 100f;
        long total = Math.round(meal_cost * (1 + tip + tax));
        System.out.println(total);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

}
