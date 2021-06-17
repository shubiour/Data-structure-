/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubiour Shuvo
 */
public class List {

   public Node head;
   public Node tail;
   public int size;

    public List( String name[],int num[]) {

        Node k = new Node(name[0], num[0], null, null);
        head = k;
        tail = k;
        size = num.length - 1;

        for (int i = 1; i < num.length; i++) {
            Node temp = new Node(name[i], num[i], null, null);
            tail.next = temp;
            tail = tail.next;
        }
    }

    public void printMethod() {
        for (Node h = head; h != null; h = h.next) {
             System.out.println("Name: "+h.name);
             System.out.println("Mobile number: "+h.number);
        }
    }

    public void addMethod(int n, String s, int num) {
        Node x = new Node(s, num, null, null);
        if (n >= 0 && n <= size) {
            if (n == 0) {
                x.next = head;
                head = x;
                size++;
            } else if (n == size) {
                Node h = head;
                while (h.next != null) {
                    h = h.next;
                }
                h.next = x;
                size++;
            } else {
                Node h = head;
                for (int i = 0; i < n - 1; i++) {
                    h = h.next;
                }
                x.next = h.next;
                h.next = x;
                size++;
            }
        }
    }
}
