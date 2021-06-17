/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubiour Shuvo
 */
public class Tree {

    public static Node root;

    public static void build(int c[]) {
        root = new Node(c[0], null, null, null);
        for (int i = 1; i < c.length; i++) {
            Node v = new Node(c[i], null, null, null);
            Node a = root;
            Node b = root;
            while (a != null) {
                if (v.item < a.item) {
                    b = a;
                    a = a.left;
                } else if (v.item > a.item) {
                    b = a;
                    a = a.right;
                } else {
                    b = a;
                    a = a.mid;
                }
            }
            if (v.item < b.item) {
                b.left = v;
            } else if (v.item > b.item) {
                b.right = v;
            } else {
                b.mid = v;
            }
        }
    }

    public static int printRightMost(Node root) {
        if (root.right == null) {
            return root.item;
        } else {
            return printRightMost(root.right);
        }
    }

    public static void preOrderVisit(Node n) {
        if (n == null) {
            return;
        } else {
            System.out.print(n.item + " ");//visit self
            preOrderVisit(n.left);
            preOrderVisit(n.mid);
            preOrderVisit(n.right);
        }
    }

    public static int level(Node r) {
        if (r == null) {
            return -1;
        }
        return 1 + level(r.parent);
    }

    public static int size(Node n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + size(n.left) + size(n.mid) + size(n.right);
        }
    }

    public static void main(String[] args) {
        int c[] = {15, 9, 8, 11, 9, 13, 27, 27, 26, 56};
        build(c);
        System.out.println(printRightMost(root));
        preOrderVisit(root);

        System.out.println("Size: " + size(root));
    }

}
