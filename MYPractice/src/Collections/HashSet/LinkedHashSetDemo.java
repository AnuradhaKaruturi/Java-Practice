package Collections.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
 

        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");
 
        System.out.println("LinkedHashSet :"+ linkedset);
        linkedset.add("C");
        linkedset.add("E");
        System.out.println("LinkedHashSet :"+ linkedset);
        Iterator iter = linkedset.iterator();
        while(iter.hasNext()){
       // linkedset.add("G");
        System.out.println(iter.next());
        }
        System.out.println("LinkedHashSet :"+ linkedset);
    }
    
}
