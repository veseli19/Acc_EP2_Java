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

    //returns data with index i
    public int get(int i){

        return head.get(i);
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
