package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;

public class Program26 {
//replace element
    public static void main(String[] args) {
        
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("List elements "+list1);
        list1.set(2, 70);
        System.out.println("After replacing List elements "+list1);
    }
    
}
