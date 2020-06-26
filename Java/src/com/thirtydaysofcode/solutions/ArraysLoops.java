/**
 * DAY 7/30
 * Arrays
 * https://www.hackerrank.com/challenges/30-arrays/
 */

package com.thirtydaysofcode.solutions;

import java.util.Scanner;
import java.util.StringJoiner;

public class ArraysLoops {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();

        final StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = n - 1; i >= 0; i--) {
            stringJoiner.add(Integer.toString(arr[i]));
        }
        System.out.println(stringJoiner.toString());
    }

}
