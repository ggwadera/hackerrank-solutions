/**
 * DAY 6/30
 * Let's Review
 * https://www.hackerrank.com/challenges/30-review-loop/
 */

package com.thirtydaysofcode.solutions;

import java.io.*;
import java.util.*;

public class LetsReview {

    private static String evenIndexes(String string) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i += 2) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    private static String oddIndexes(String string) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < string.length(); i += 2) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String string = scanner.nextLine();
            System.out.println(evenIndexes(string) + " " + oddIndexes(string));
        }

    }
}
