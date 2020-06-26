package com.thirtydaysofcode;

/**
 * Node class used in some of the binary tree challenges
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
