package Collections.LinkedList.LinkedListAssignment;

import java.util.Collections;
import java.util.LinkedList;
//shuffle list
public class Program16 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("List elements :"+list);
        Collections.shuffle(list);
        System.out.println("List after shuffling elements :"+list);

    }
    
}
