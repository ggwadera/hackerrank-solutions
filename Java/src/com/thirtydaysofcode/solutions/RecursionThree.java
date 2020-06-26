/**
 * DAY 9/30
 * Recursion 3
 * https://www.hackerrank.com/challenges/30-recursion/
 */

package com.thirtydaysofcode.solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class RecursionThree {

    // Complete the factorial function below.
    static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
