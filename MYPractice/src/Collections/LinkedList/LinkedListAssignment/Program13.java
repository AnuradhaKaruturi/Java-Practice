package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;
//removefirst and last elements
public class Program13 {

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("List elements :"+list);
        list.removeFirst();
        list.removeLast();

        System.out.println("List elements after removing first and last :"+list);
        
    }
    
}
