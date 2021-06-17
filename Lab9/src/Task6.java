
import com.sun.glass.ui.Size;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shubiour Shuvo
 */
public class Task6 {

    /**
     * @param args the command line arguments
     */
    public static Node head;
    public static int Size;

    public static void body(int a[]) {

        Node tail;
        Node k = new Node(a[0], null);
        head = k;
        tail = k;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null);
            tail.next = temp;
            tail = tail.next;
            Size++;
        }
    }

    public static int recursiveSum(Node h) {
        
        if (Size == 0) {
            return h.val;
        } else {
            Size--;
            return h.val + recursiveSum(h.next);
        }
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        body(a);
        System.out.println(recursiveSum(head));
    }
}
