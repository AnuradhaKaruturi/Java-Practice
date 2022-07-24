package Collections.LinkedList.LinkedListCodingAssignment;

import java.util.Collections;
import java.util.LinkedList;

public class MergeLinkedList {

    public static void main(String[] args) {
        
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(10);
        list1.add(40);
        list1.add(30);
        list1.add(80);
        list1.add(50);
        System.out.println("List elements "+list1);

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(20);
        list2.add(60);
        list2.add(5);
        list2.add(100);
        System.out.println("List elements "+list2);

        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println("Merged list is :"+list1);

    }
    
}
