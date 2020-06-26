/**
 * DAY 23/30
 * BST Level-Order Traversal
 * https://www.hackerrank.com/challenges/30-binary-trees/
 */
package com.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringJoiner;

public class BreadthFirstTraversal {

    static void levelOrder(Node root) {
        if (root != null) {
            Queue<Node> queue = new LinkedList<>();
            StringJoiner sj = new StringJoiner(" ");
            queue.add(root);
            while (!queue.isEmpty()) {
                Node node = queue.remove();
                sj.add(Integer.toString(node.data));
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            System.out.println(sj.toString());
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
        sc.close();
    }
}
