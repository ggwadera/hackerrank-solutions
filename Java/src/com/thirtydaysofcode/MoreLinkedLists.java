/**
 * DAY 24/30
 * More Linked Lists
 * https://www.hackerrank.com/challenges/30-linked-list-deletion/
 */
package com.thirtydaysofcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class MoreLinkedLists {

    public static Node removeDuplicates(Node head) {
        // Write your code here
        if (head == null)
            return null;
        Set<Integer> set = new HashSet<>();
        Node previous, node;
        previous = node = head;
        set.add(node.data);
        while (previous.next != null) {
            node = previous.next;
            int data = node.data;
            if (set.contains(data)) {
                if (node.next != null)
                    previous.next = node.next;
                else
                    previous.next = null;
            } else {
                set.add(data);
                previous = node;
            }
        }
        return head;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

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
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);
        sc.close();
    }
}