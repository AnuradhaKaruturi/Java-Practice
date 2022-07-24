package Collections.HashSet.HashSetAssignment;

import java.util.HashSet;

public class Program14 {

    public static void main(String[] args) {
        HashSet<String> hset1 = new HashSet<String>();
        hset1.add("one");
        hset1.add("two");
        hset1.add("three");
        System.out.println("Set1 Elements "+hset1);
        HashSet<String> hset2 = new HashSet<String>();
        hset2.add("four");
        hset2.add("five");
        hset2.add("one");
        hset2.add("two");
        System.out.println("Set2 Elements "+hset2);

        // Union of two sets
    hset1.addAll(hset2);
    System.out.println("Union is: " + hset1);
     hset1.clear();
    // Intersection of two sets
        hset1.add("one");
        hset1.add("two");
        hset1.add("three");
        System.out.println("Set1 Elements "+hset1);
        System.out.println("Set2 Elements "+hset2);
    hset1.retainAll(hset2);
    System.out.println("Intersection is: " + hset1);
    

    //check set is subset of another set
    HashSet<String> set3 = new HashSet<String>();
    set3.add("one");
    set3.add("two");
    HashSet<String> set4 = new HashSet<String>();
    set4.add("pine");
    System.out.println("Set2 Elements "+hset2);
    System.out.println("Set3 Elements "+set3);
    System.out.println("Set4 Elements "+set4);
    System.out.println("Is set3 a subset of set2 :"+ hset2.containsAll(set3));
    System.out.println("Is set3 a subset of set2 :"+ hset2.containsAll(set4));
    
    }

}
    

