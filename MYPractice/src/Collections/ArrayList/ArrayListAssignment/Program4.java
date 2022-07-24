package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//retrieve element from specified position
public class Program4 {

    public static void main(String[] args) {
        
    List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List Elements "+ list);
        System.out.println("List element at postion 3 is "+ list.get(2));
    }
}
