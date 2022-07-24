package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

    public static void main(String[] args) {
        
        //insert elements at first position
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List Elements "+ list);
        list.add(0, 100);
        System.out.println("List Elements after inserting at first position "+ list);
    }
    
}
