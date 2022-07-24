package Collections.TreeSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

    public static void main(String[] args) {
        
        NavigableSet<Integer> ns = new TreeSet<>();

        ns.add(10);
        ns.add(20);
        ns.add(30);
        ns.add(40);
        ns.add(50);
        ns.add(100);
        ns.add(200);
        ns.add(300);
        ns.add(400);
        ns.add(500);
        ns.add(600);
        ns.add(700);

        System.out.println("Normal order: " + ns);
        
        NavigableSet<Integer> revns = ns.descendingSet();
        System.out.println("Reverse order: " + revns);


        System.out.println("lower(300): " + ns.lower(300));
        System.out.println("floor(300): " + ns.floor(300));
        System.out.println("higher(300): " + ns.higher(300));
        System.out.println("ceiling(300): " + ns.ceiling(300));

        System.out.println("First Value " + ns.first());
        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);
 
        System.out.println("Last Value " + ns.last());
        System.out.println("pollLast(): " + ns.pollLast());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("Contains 500 in Set : "+ ns.contains(500));
        ns.remove(500);
        System.out.println("After removing element " + ns);

        System.out.println("headset Elements less than 300 in set are  "+ns.headSet(300));
        System.out.println("headset Elements less than 300 in set with inclusive value are  "+ns.headSet(300,true));
        System.out.println("headset Elements less than 300 in set without inclusive value are  "+ns.headSet(300,false));


        System.out.println("Iterating elements using iterator :");
        Iterator<Integer> iter = ns.iterator();
        iter.forEachRemaining(x->System.out.print(x+" "));

        System.out.println("Iterating elements using DescendingIterator :");
        Iterator<Integer> desciter = ns.descendingIterator();
        desciter.forEachRemaining(x->System.out.print(x+" "));
    }

}
    

