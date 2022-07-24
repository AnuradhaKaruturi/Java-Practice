package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

public class Program21 {
//join two ArrayLists
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List1 elements "+ list);

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(60);
        list1.add(70);
        list1.add(80);
        System.out.println("List1 elements "+ list);

        list.addAll(list1);
        System.out.println("List elements "+list);
    }
    
}
