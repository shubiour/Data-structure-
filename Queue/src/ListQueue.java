/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubiour Shuvo
 */
public class ListQueue {

    Node head;
    int size = 0;

    public void enque(int elem) {
        Node n = new Node(elem, null);
        if (head == null) {
            head = n;
        } else {
            Node h = head;
            while (h.next != null) {
                h = h.next;
            }
            h.next = n;
            size++;
        }
    }

    public int deque() throws QueueUnderflowException {
        if (head == null) {
            throw new QueueUnderflowException();
        }
        Node del = head;
        head = head.next;
        del.next = null;
        size--;
        return del.val;
    }

    public String toString() {
        if (size == 0) {
            return "Empty Queue";
        }
        String collect = " ";
        for (Node h = head; h != null; h = h.next) {
            collect = collect + " " + h.val;
        }
        return collect;
    }
}
