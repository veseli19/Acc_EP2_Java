public class LinkedList {

    private SLNode head;
    
    //Add an element at the end of the list. 
    public boolean add(int n){

        SLNode newNode = new SLNode(n, null);
        
        if(head == null){
            head = newNode;
            return true;
        }

        SLNode current = head;

        while(current.getNext() != null){
            if(current.getData() == n){
                return false;
            }
            current = current.getNext();
        }
        current.setNext(newNode);
        return true;
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

    //Add before specified index
    public boolean addBefore(int data, int i){

        SLNode newNode = new SLNode(data, null);

        if(head == null || i < 0 || i > size() - 1){
            return false;
        } 

        if(size() == 1 && i == 1){
            newNode.setNext(head);
            head = newNode;
            return true;
        }

        int count = 0;
        SLNode current = head;
        SLNode help = head;

        while(i < size()){
            
            if(i == count && current != null){
                newNode.setNext(current);
                help.setNext(newNode);
                return true;
            }
            help = current;
            current = current.getNext();
           
            count++;
        }
        return false;

    } 

    //delete a node with same data
    public boolean remove(int data){

        if(head.getData() == data){
            
            head.setNext(head.getNext());
            
            return true;
        }

        if(size() == 2 && head.getData() == data){
            head = getLast();
            return true;
        }

        if(getLast().getData() == data){
            SLNode current = head;
            while(current.getNext() != getLast()){
                current = current.getNext();
            }
            
            current.setNext(null);
            return true;
        }

        SLNode current = head;
        SLNode help = null;
        while(current != null){
            if(current.getData() == data){
                help.setNext(current.getNext());
                current = help;
                return true;
            }
            help = current;
            current = current.getNext();
            
        }
        return false;
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

        while(current.getNext() != null){
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
