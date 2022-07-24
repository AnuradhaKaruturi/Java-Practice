package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//shuffle the elements
public class Program9 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List Elements "+ list);
        Collections.shuffle(list);
        System.out.println("List Elements after shuffle"+ list);

        Collections.shuffle(list, new Random(3));
        System.out.println("Shuffled List with Random(3) : "+ list);
    }

    
}
