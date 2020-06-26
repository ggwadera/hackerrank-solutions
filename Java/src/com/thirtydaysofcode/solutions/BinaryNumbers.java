/**
 * DAY 10/30
 * Binary Numbers
 * https://www.hackerrank.com/challenges/30-binary-numbers/
 */

package com.thirtydaysofcode.solutions;

import java.util.*;

public class BinaryNumbers {

    private static void maxConsecutiveOnes(int n) {
        String[] ones = Integer.toBinaryString(n).split("0");
        System.out.println(Arrays.stream(ones).mapToInt(String::length).max().getAsInt());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.close();
        maxConsecutiveOnes(n);
    }
}
