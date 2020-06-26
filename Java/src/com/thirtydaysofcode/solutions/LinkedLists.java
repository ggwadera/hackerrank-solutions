/**
 * DAY 15/30
 * Linked List
 * https://www.hackerrank.com/challenges/30-linked-list/
 */

package com.thirtydaysofcode.solutions;

import com.thirtydaysofcode.utils.Node;

import java.util.Scanner;

public class LinkedLists {

    public static Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node node = head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new Node(data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

}
