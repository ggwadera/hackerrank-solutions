/**
 * DAY 19/30
 * Interfaces
 * https://www.hackerrank.com/challenges/30-interfaces/
 */

package com.thirtydaysofcode;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = java.util.stream.IntStream.rangeClosed(1, n).parallel().filter(i -> n % i == 0).sum();
        return sum;
    }
}

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
