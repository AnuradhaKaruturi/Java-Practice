package Collections.HashSet.HashSetAssignment;

import java.util.HashSet;
import java.util.Iterator;

//add specified elemnt at end of hashSet
public class Program1 {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("cat");
        hset.add("dog");
        hset.add("fish");
        hset.add("monkey");
        hset.add("parrot");
        //prog2 iterate through hashSet
        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
         //prog3 no.of.elements hashSet
         int no_of_elements = hset.size();
         System.out.println("Number of elements in HashSet :"+no_of_elements);
         //prog4 empty hashSet
         hset.clear();
         //prog5 test hashset empty or not
         System.out.println("Is HashSet Empty: " + hset.isEmpty());
    }
    
}
