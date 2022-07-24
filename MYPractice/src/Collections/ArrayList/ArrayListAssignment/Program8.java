package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//sort the list
public class Program8 {

    public static void main(String[] args) {
        
    List<Integer> list = new ArrayList<Integer>();
    list.add(50);
    list.add(10);
    list.add(30);
    list.add(60);
    list.add(20);
    list.add(40);

    System.out.println("List elemnets before Sorting :"+list);
    Collections.sort(list);
    System.out.println("List elemnets after Sorting :"+list);
    
    }
}
