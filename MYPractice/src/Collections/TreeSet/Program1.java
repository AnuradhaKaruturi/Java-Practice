package Collections.TreeSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

import Collections.ArrayList.ArrayListAssignment.Program6;

public class Program1 {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();
        set.add("rose");
        set.add("Tulip");
        set.add("Lily");
        set.add("Orchids");
        set.add("Poppy");
        //prog2
        Iterator iter = set.iterator();
        System.out.println("Tree Elements :");
        while(iter.hasNext()){
        System.out.println( iter.next());
        }

        //prog3
        TreeSet<String> treeset = new TreeSet<>(set);
        System.out.println("TreeSet Elements : "+treeset);

        //prog4
        System.out.println("Original tree set:" + treeset);  
     Iterator it = treeset.descendingIterator();
     
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
     }



     //prog5
     String first = set.first();
     System.out.println("First Element is: "+first);
 
    String last =  set.last();
    System.out.println("Last Element is: "+last);


    //Prog6
    System.out.println("Original tree set:" + set);  
    Object new_set = set.clone();
    System.out.println("Cloned tree list: " + new_set);  
    //prog7
    System.out.println("Size of the tree set:" + set.size());  

    //prog8

    System.out.println("First tree set:" + set);  
    System.out.println("Second tree set:" + treeset);  
    System.out.println("Compared sets are Equal or not ? "+set.containsAll(treeset));
    treeset.add("daisy");
    System.out.println("Second tree "+treeset);
    System.out.println("Compared sets are Equal or not ? "+set.containsAll(treeset));
     }

    }
    

