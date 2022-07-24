package Collections.LinkedList.LinkedListCodingAssignment;

import java.util.Collections;
import java.util.LinkedList;

public class RemoveDuplicatesSortedLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(30);
        list.add(10);
        list.add(50);
        Collections.sort(list);
        System.out.println("Sorted LinkedList elements :"+list);
        LinkedList<Integer> newlist = new LinkedList<Integer>();
        for(Integer i : list){
            if(!newlist.contains(i)){
                newlist.add(i);
            }
        }
        System.out.println("Sorted LinkedList after removing duplicate elements :"+newlist);

    }
    
}
