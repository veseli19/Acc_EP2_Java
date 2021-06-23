public class LinkedList {

    private SLNode head;
    private String str;

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
        String result = "";

        while(current != null){
            if(current.getNext() != null){
                result += current.getData() + "->";
            }else{
                result += current.getData();
            }
        }
        return result;
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
