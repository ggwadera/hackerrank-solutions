package com.thirtydaysofcode;

/**
 * Abstract class used in some the challenges.
 * Used in:
 * - AbstractClasses
 */
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
