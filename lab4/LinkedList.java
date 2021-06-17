
public class LinkedList {

    public Node head;

    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public LinkedList(Object[] a) {
        Node preNode = null;
        for (int i = 0; i < a.length; i++) {
            Node newNode = new Node(a[i], null);
            if (i == 0) {
                head = newNode;
                preNode = head;
            } else {
                preNode.next = newNode;
                preNode = newNode;
            }
        }
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public LinkedList(Node h) {
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        int counter = 0;
        for (Node i = head; i != null; i = i.next) {
            counter++;
        }
        return counter;
    }

    /* prints the elements in the list */
    public void printList() {
        for (Node i = head; i != null; i = i.next) {
            System.out.print(i.element + " ");
        }
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx) {
        int j = 0;
        for (Node i = head; i != null; i = i.next) {
            if (j == idx) {
                return i;
            }
            j++;
        }
        return null; // please remove this line!
    }

// returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx) {
        int j = 0;
        for (Node i = head; i != null; i = i.next) {
            if (j == idx) {
                return i.element;
            }
            j++;
        }
        return null; // please remove this line!
    }

    /* updates the element of the Node at the given index. 
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */
    public Object set(int idx, Object elem) {
        int j = 0;
        for (Node i = head; i != null; i = i.next) {
            if (j == idx) {
                Object preElem = i.element;
                i.element = elem;
                return preElem;
            }
            j++;
        }
        return null; // please remove this line!
    }

    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
        int j = 0;
        for (Node i = head; i != null; i = i.next) {
            if (i.element == elem) {
                return j;
            }
            j++;
        }
        return -1;
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem) {
        boolean check = false;
        for (Node i = head; i != null; i = i.next) {
            if (i.element == elem) {
                return true;
            }
        }
        return false;
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList() {
        Node copyHead = null;
        Node preNode = null;
        for (Node i = head; i != null; i = i.next) {
            Node newNode = new Node(i.element, null);
            if (copyHead == null) {
                copyHead = newNode;
                preNode = copyHead;
            } else {
                preNode.next = newNode;
                preNode = newNode;
            }
        }
        return copyHead;
    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList() {
        Node newHead = null;
        Node i = head;
        while (i != null) {
            Node nextNode = i.next;
            i.next = newHead;
            newHead = i;
            i = nextNode;
        }
        return newHead;
    }

    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx) {
        if (idx < 0 && idx > countNode()) {
            return;
        }

        Node newNode = new Node(elem, null);
        if (idx == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node pred = nodeAt(idx - 1);
            newNode.next = pred.next;
            pred.next = newNode;
        }
    }

    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
        if (index < 0 && index > countNode()) {
            return null;
        }
        Node removedNode = nodeAt(index);
        if (index == 0) {
            head = head.next;
        } else {
            Node pred = nodeAt(index - 1);
            pred.next = removedNode.next;
        }
        return removedNode.element; // please remove this line!
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft() {
        Node oldHead = head;
        Node newTail = null;
        head = oldHead.next;
        for (Node i = head; i != null; i = i.next) {
            newTail = i;
        }
        newTail.next = oldHead;
        oldHead.next = null;
    }

    // Rotates the list to the right by 1 position.
    public void rotateRight() {
//        Node prevNode = nodeAt(countNode() - 2);
//        prevNode.next.next = head;
//        head = prevNode.next;
//        prevNode.next = null;
Node var = nodeAt(countNode()-1);
Node var2 = nodeAt(countNode()-2);
var.next = head;
head = var;
var2.next = null;
    }
}
