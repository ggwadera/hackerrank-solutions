package com.thirtydaysofcode;

/**
 * Node class used in some of the challenges.
 * Used in:
 * - LinkedLists
 * - BSTHeight
 * - BreadthFirstTraversal
 */
public class Node {
    Node left, right, next;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
        next = null;
    }
}
