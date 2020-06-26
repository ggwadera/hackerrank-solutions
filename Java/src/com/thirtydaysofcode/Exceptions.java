/**
 * DAY 16/30
 * Exceptions - String to Integer
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/
 */

package com.thirtydaysofcode;

import java.util.*;

public class Exceptions {

    public static void parseInteger(String s) {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        parseInteger(S);
    }

}
