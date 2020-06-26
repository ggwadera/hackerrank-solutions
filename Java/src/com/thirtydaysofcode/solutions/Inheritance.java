/**
 * DAY 12/30
 * Inheritance
 * https://www.hackerrank.com/challenges/30-inheritance/
 */

package com.thirtydaysofcode.solutions;

import com.thirtydaysofcode.utils.Person;

import java.util.*;

public class Inheritance {

    private static class Student extends Person {
        private int[] testScores;

        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        public Student(String firstName, String lastName, int id, int[] scores) {
            super(firstName, lastName, id);
            this.testScores = scores;
        }

        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        public char calculate() {
            int average = java.util.stream.IntStream.of(testScores).sum() / testScores.length;
            return Grades.getGrade(average);
        }

        private static enum Grades {
            T(40), D(55), P(70), A(80), E(90), O(100);

            private int score;

            Grades(int score) {
                this.score = score;
            }

            public static char getGrade(int score) {
                for (Grades grade : Grades.values()) {
                    if (score < grade.score) {
                        System.out.println(grade.toString());
                        return grade.toString().charAt(0);
                    }
                }
                return 'O';
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}