/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubiour Shuvo
 */
public class Node {

    int item;
    Node left;
    Node right;
    Node parent;

    public Node(int i, Node l, Node r, Node p) {
        item = i;
        left = l;
        right = r;
        parent = p;
    }
}
