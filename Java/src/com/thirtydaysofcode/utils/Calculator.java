package com.thirtydaysofcode.utils;

/**
 * Class used in some the challenges.
 * The methods were written by me.
 * Used in:
 * - MoreExceptions
 * - Interfaces
 */
public class Calculator implements AdvancedArithmetic {

    /**
     * Calculates the sum of all the divisors of the number.
     * @param n integer number
     * @return the sum of all the divisors of the number n.
     */
    public int divisorSum(int n) {
        int sum = java.util.stream.IntStream.rangeClosed(1, n).parallel().filter(i -> n % i == 0).sum();
        return sum;
    }

    /**
     * Calculates the power of n^p.
     * @param n number.
     * @param p exponent.
     * @return the result of n^p.
     * @throws IllegalArgumentException
     */
    public int power(int n, int p) throws IllegalArgumentException {
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}
