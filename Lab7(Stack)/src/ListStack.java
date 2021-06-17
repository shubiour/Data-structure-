
public class ListStack implements Stack {

    int size;
    Node top;

    public ListStack() {
        size = 0;
        top = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void push(Object e) throws StackOverflowException {
        Node n = new Node(e, null);
        n.next = top;
            top = n;
            size++;
        }
    

    public Object pop() throws StackUnderflowException {
        Node remove=null;
        if (isEmpty()) {
            throw new StackUnderflowException();
        } else {
            remove = top;
            top = top.next;
            remove.next = null;
            size--;
        }
        return remove.val;
    }

    public Object peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        } else {
            return top.val;
        }
    }

    public String toString() {
        if (size == 0) {
            return "Empty Stack";
        }
        String collect = "";
        for (Node h = top; h != null; h = h.next) {
            collect = collect + " " + h.val;
        }
        return collect;
    }

    public Object[] toArray() {
        Object newArray[] = new Object[size];
        Node h = top;
        for (int i = 0; i < size; i++) {
            newArray[i] = h.val;
            h = h.next;
        }
        return newArray;
    }

    public int search(Object e) {
        Node h = top;
        int num = 0;
        while (h != null) {
            if ((h.val).equals(e)) {
                return num;
            } else {
                num++;
            }
            h = h.next;
        }
        return -1;
    }

}
