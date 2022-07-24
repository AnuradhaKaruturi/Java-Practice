package Collections.LinkedList.LinkedListCodingAssignment;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List elements "+list);
        Collections.reverse(list);
        System.out.println("List elements after reversing  "+list);
    }
    
}
