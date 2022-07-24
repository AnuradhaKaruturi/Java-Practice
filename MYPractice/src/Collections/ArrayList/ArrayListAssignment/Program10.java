package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//reverse the Elements
public class Program10 {
    
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List Elements "+ list);
        Collections.reverse(list);
        System.out.println("After reverse the List Elements "+ list);
        
    }
}
