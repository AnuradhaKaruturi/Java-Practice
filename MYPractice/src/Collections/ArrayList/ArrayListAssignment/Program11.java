package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program11 {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List Elements "+ list);
        Collections.swap(list, 2, 3);
        System.out.println("After Swapping List Elements "+ list);
    }
    
}
