/**
 * DAY 20/30
 * Sorting
 * https://www.hackerrank.com/challenges/30-sorting/
 */

package com.thirtydaysofcode.solutions;

import java.util.Scanner;

public class Sorting {

    public static void bubbleSort(int[] array) {
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    numberOfSwaps++;
                    swapped = true;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (!swapped) {
                break;
            }
        }
        System.out.println("Array is sorted in "+ numberOfSwaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        bubbleSort(a);
    }

}
