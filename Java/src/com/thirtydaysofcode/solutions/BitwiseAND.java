package com.thirtydaysofcode.solutions;

import java.util.Scanner;

public class BitwiseAND {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Finds the maximum value of bitwise AND of A and B that is less than k (max(A & B) < k) for
     * a given set S = {1, 2, 3, ..., N}
     * @param n size of the set
     * @param k limit value
     * @return the maximum value below k
     */
    private static int findMax(int n, int k) {
        int max = 0;
        for (int i = 1; i < k; i++) {
            for (int j = i + 1; j <= n; j++) {
                int bitwiseAnd = i & j;
                if (bitwiseAnd > max && bitwiseAnd < k) max = bitwiseAnd;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(findMax(n, k));
        }
        scanner.close();
    }

}
