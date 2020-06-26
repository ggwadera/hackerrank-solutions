package com.thirtydaysofcode;

/**
 * Class used in some the challenges.
 * Used in:
 * - MoreExceptions
 * - Interfaces
 */
class Calculator implements AdvancedArithmetic {

    /**
     * Calculates the sum of all the divisors of the number.
     * @param n integer number
     * @return the sum of all the divisors of the number n.
     */
    public int divisorSum(int n) {
        int sum = java.util.stream.IntStream.rangeClosed(1, n).parallel().filter(i -> n % i == 0).sum();
        return sum;
    }

    public int power(int n, int p) throws IllegalArgumentException {
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}
