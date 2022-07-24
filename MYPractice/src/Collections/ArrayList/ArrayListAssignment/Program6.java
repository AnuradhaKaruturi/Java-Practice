package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//remove third element from ArrayList
public class Program6 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List Elements "+ list);
        list.remove(2);
        System.out.println("List Elements after removing 3rd element :"+list);
    }
    
}
