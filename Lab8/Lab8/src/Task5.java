/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubiour Shuvo
 */
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a[] = {40, 10, 30, 50, 20, 70, 90, 60, 80};
        InsertSort(a);
    }

    public static void InsertSort(int[] a) {
        Node head;
        Node tail;
        Node k = new Node(a[0], null, null);
        head = k;
        tail = k;
        for (int i = 1; i < a.length; i++) { //First I build the DOUBLY linkedlist
            Node temp = new Node(a[i], null, null);
            tail.next = temp;
            temp.prev = tail;
            tail = tail.next;
        }
        for (Node i = head.next; i != null; i = i.next) {
            for (Node j = head; j != i; j = j.next) {
                if (i.element < j.element) {                //Sort
                    int temp = j.element;
                    j.element = i.element;
                    i.element = temp;
                }
            }
        }
        Node h = head;
        while (h.next != null) {
            System.out.print(h.element + " ");
            h = h.next;
        }
        System.out.print(h.element);
        System.out.println();
        Node i = h;
        while (i.prev != null) {
            System.out.print(i.element + " ");
            i = i.prev;
        }
        System.out.print(i.element);
        System.out.println();
    }
}
