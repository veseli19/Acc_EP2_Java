

public class Test{
    public static void main(String[] args) {
        
        LinkedList ls1 = new LinkedList();

        System.out.println(ls1.add(10));
        System.out.println(ls1.add(5));
        System.out.println(ls1.add(1));
        System.out.println(ls1.add(10));
        System.out.println(ls1.add(20));
        System.out.println(ls1.add(11));
        System.out.println(ls1.add(202));
        System.out.println(ls1.add(1000));
        System.out.println(ls1.toString());
        System.out.println(ls1.get(2));    //1
        System.out.println(ls1.get(5));    //202 
        System.out.println(ls1.getElement(1000)); //1000
        System.out.println(ls1.getElement(1001)); //0
        System.out.println(ls1.size());  //7
    }
}