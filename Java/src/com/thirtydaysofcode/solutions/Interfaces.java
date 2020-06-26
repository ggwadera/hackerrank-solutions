/**
 * DAY 19/30
 * Interfaces
 * https://www.hackerrank.com/challenges/30-interfaces/
 */

package com.thirtydaysofcode.solutions;

import com.thirtydaysofcode.utils.AdvancedArithmetic;
import com.thirtydaysofcode.utils.Calculator;

import java.util.Scanner;

class Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
