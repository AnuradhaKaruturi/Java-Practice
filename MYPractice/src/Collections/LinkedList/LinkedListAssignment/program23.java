package Collections.LinkedList.LinkedListAssignment;

import java.util.ArrayList;
import java.util.LinkedList;
//convert linked list to ArrayList
public class program23 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("LinkedList  elements :"+list);

        ArrayList<Integer> arrList = new ArrayList<>(list);
        System.out.println("ArrayList  elements :"+arrList);
    }
    
}
