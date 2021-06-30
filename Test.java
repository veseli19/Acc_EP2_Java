

public class Test{
    public static void main(String[] args) {
        
        LinkedList ls1 = new LinkedList();
        LinkedList ls2 = new LinkedList();

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

        System.out.println(ls2.addFirst(1));
        System.out.println(ls2.addFirst(10));
        System.out.println(ls2.addFirst(100));
        System.out.println(ls2.addFirst(21));
        System.out.println(ls2.addFirst(23));
        System.out.println(ls2.addFirst(25));
        System.out.println(ls2.addFirst(11));
        System.out.println(ls2.addFirst(7));
        System.out.println(ls2.addAfter(909, 3));   //true
        System.out.println(ls2.addAfter(19, 9));    //false
        System.out.println(ls2.addAfter(19, 8));    //true
        System.out.println(ls2.addAfter(0, 5));
        System.out.println(ls2.addBefore(101, 5));
        System.out.println(ls2.addBefore(101, 20));
        System.out.println(ls2.remove(19));
        System.out.println(ls2.remove(0));
        System.out.println(ls2.remove(7));
        System.out.println(ls2.toString());
    }
}