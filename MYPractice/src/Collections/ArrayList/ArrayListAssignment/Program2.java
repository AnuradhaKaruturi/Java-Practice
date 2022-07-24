package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//Iterate through ArrayList
public class Program2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Elements in the List are : ");
        for (Integer i : list) {
            System.out.println(i);
            
        }
        
    }
    
}
