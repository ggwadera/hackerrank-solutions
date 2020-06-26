/**
 * DAY 11/30
 * 2D Arrays
 * https://www.hackerrank.com/challenges/30-2d-arrays/
 */

package com.thirtydaysofcode.solutions;

import java.util.*;

public class TwoDArrays {

    private static final Scanner scanner = new Scanner(System.in);

    private static void maxHourglassSum(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < array.length - 2; row++) {
            for (int i = 0; i < array[0].length - 2; i++) {
                int sum = 0;
                sum += array[row][i] + array[row][i + 1] + array[row][i + 2];
                sum += array[row + 1][i + 1];
                sum += array[row + 2][i] + array[row + 2][i + 1] + array[row + 2][i + 2];
                if (sum > max) max = sum;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        maxHourglassSum(arr);
    }

}
