package Collections.ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
       List<Integer> list =  new ArrayList<Integer>();
       list.add(10);
       list.add(30);
       list.add(20);
       list.add(50);
       list.add(20);
       list.add(10);
       list.add(30);

       System.out.println("List with Duplicates "+list);
       Set<Integer> set = new LinkedHashSet<Integer>(list);
       list.clear();
       list.addAll(set);
       System.out.println("List without Duplicates "+list);

    }
    
}
