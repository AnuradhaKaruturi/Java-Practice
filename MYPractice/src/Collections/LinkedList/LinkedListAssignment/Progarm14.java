package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;
//remove all elements
public class Progarm14 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List elements :"+list);
        list.clear();
        System.out.println("List elements after removing elements :"+list);
        
        
    }
    
}
