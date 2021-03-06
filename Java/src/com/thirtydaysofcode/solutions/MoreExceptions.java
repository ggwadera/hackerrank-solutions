/**
 * DAY 17/30
 * More Exceptions
 * https://www.hackerrank.com/challenges/30-more-exceptions/
 */

package com.thirtydaysofcode.solutions;

import com.thirtydaysofcode.utils.Calculator;

import java.util.*;

public class MoreExceptions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

}
