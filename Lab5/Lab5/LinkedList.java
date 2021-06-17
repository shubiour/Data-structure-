public class LinkedList{
  public  Node head;
  public Node tail;
  public  int size; 
  public LinkedList(Object [] a){
    Node k = new Node(a[0], null);
    head = k;
    tail = k;
    size = a.length-1;
    
    for(int i=1; i<a.length; i++){
      Node temp =  new Node(a[i], null);
      tail.next = temp;
      tail = tail.next;
    }
  }
  
  void printList(){
    for(Node h = head; h != null; h = h.next){
      System.out.print(h.element+" ");
      
    }
    System.out.println("size: "+size);
  }
  public void insert(int n, Object newElem){
    Node x = new Node(newElem, null);
    if(n>=0 && n<=size){
      if(n == 0){
        x.next = head;
        head = x; 
        size++;
      }
      else if(n == size){
        Node h = head;
        while(h != null){
          if(h.next == null){
            h.next = x; 
          }
          h.next = h;
        }
        size++;
      }
      else {
        Node h = head;
        for(int i =0;  i <n-1; i++){
          h = h.next;
        }
        x.next = h.next;
        h.next = x; 
        size++;
      }
    }
  }
  public void delete(int n){
    Node del;
    if(n>=0 && n<=size){
      if(n == 0){
        del = head;
        head =  head.next;
        del =  null;
        size--;
      }
      else if(n == size){
        Node y = head;
        
        for(int i =0; i<=size-1; i--){
          y =y.next; 
        }
        del = y.next;
        y.next=null;
        del = null;
        size--;
      }
      else {
        Node y = head;
        
        for(int i =0; i<=n-1; i--){
          y =y.next; 
        }
        del = y.next;
        y.next = del.next;
        del.next = null;
        size--;
    }
  }
}
}

  
