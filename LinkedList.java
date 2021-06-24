public class LinkedList {

    private SLNode head;
    

    //Add an element at the end of the list. 
    public boolean add(int n){
        
        SLNode newNode = new SLNode(n, null);
        
        if(head == null){
            head = newNode;
            return true;
        }else{

            SLNode current = head;

            while(current != null){
                if(current.getData() == newNode.getData()){
                    return false;
                }
                current = current.getNext();
            }

            return true;
        }

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
