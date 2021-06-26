public class LinkedList {

    private SLNode head;
    
    //Add an element at the end of the list. 
    public boolean add(int n){
        
        if(head == null){
            head = new SLNode(n, null);
            return true;
        }
        return head.add(n);

    }
    //Add a node at the beginning of the list
    public boolean addFirst(int n){

        SLNode newNode = new SLNode(n, null);
        
        if(head == null){
            head = newNode;
            return true;
        }
        
        newNode.setNext(head);
        head = newNode;
        return true;
    }

    //Add after specified index
    public boolean addAfter(int data, int i){

        SLNode newNode = new SLNode(data, null);
        
        SLNode current = head;
        int counter = 0;

        if(head == null || i > size() - 1 || i < 0){
            return false;
        }
        if(i == size()){
            getLast().setNext(newNode);
            return true;
        }

        while(i != counter){
            current = current.getNext();
            counter++;
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        return true;

    }

    //returns data with index i
    public int get(int i){

        return head.get(i);
    }

    // Returns the data with the specified element or 0 if no such data exits in the list.
    public int getElement(int data){

        return head.getElement(data);
    }

    public int size(){

        return head.size();
    }

    public String toString(){

        SLNode current = head;
        StringBuilder str = new StringBuilder();

        if(head == null){
            return "This list is empty";
        }

        while(current != null){
           str.append(current.getData()).append("->");
           current = current.getNext();
        }
        return str.toString();
    }

    public SLNode getLast(){

        SLNode current = head;

        while(current != null){
            current = current.getNext();
        }
        return current;
    }
    
}

class SLNode{
    
    private int data;
    private SLNode next;

    public SLNode(int data, SLNode next){
        this.data = data;
        this.next = next;
    }

    //Add data to the node
    public boolean add(int data){
        
        if(data == this.data){
            return false;
        }

        if(next == null){
            next = new SLNode(data, null);
            return true;
        }else{
            return next.add(data);
        }
    }

    //Get data
    public int get(int i){

        if(i == 0){
            return this.data;
        }else{
            return next.get(i - 1);
        }
    }

    public int size(){

        if(next == null){
            return 1;
        }
        return 1 + next.size();
    }

    // Returns the data with the specified element or 0 if no such data exits in the list.
    public int getElement(int n){

        if(this.data == n){
            return this.data;
        }
        if(next == null){
            return 0;
        }
        return next.getElement(n);
    }

    /*GETTER AND SETTER */
    public void setData(int data){
        this.data = data;
    }

    public void setNext(SLNode next){
        this.next = next;
    }

    public int getData(){
        return this.data;
    }

    public SLNode getNext(){
        return this.next;
    } 
}
