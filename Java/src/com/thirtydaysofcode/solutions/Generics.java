/**
 * DAY 21/30
 * Generics
 * https://www.hackerrank.com/challenges/30-generics/
 */

package com.thirtydaysofcode.solutions;

import java.util.*;

public class Generics {

    static class Printer <T> {

        /**
         *    Method Name: printArray
         *    Print each element of the generic array on a new line. Do not return anything.
         *    @param array generic array
         **/
        public <E> void printArray(E[] array) {
            for (E element : array) {
                System.out.println(element.toString());
            }
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}
