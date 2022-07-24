package Collections.HashSet.HashSetAssignment;

import java.util.HashSet;

public class Program10 {
    public static void main(String[] args) {
        HashSet<String> hset1 = new HashSet<String>();
        hset1.add("one");
        hset1.add("two");
        hset1.add("three");
        hset1.add("four");
        hset1.add("apple");
        hset1.add("mango");
        System.out.println(" HashSet :"+hset1);

        HashSet<String> hset2 = new HashSet<String>();
        hset2.add("one");
        hset2.add("two");
        hset2.add("three");
        hset2.add("four");
        System.out.println(" HashSet :"+hset1);
        //compare hashSets
        EqualOrNot(hset1,hset2);
        hset2.add("five");
        System.out.println("After adding one elements to second set :");
        EqualOrNot(hset1,hset2);
        hset2.add("six");
        hset2.add("seven");

        //prog11 retain elements which are common in both sets
        hset1.retainAll(hset2);
        System.out.println("HashSet content:");
        System.out.println(hset1);

        //prog12 removeAll
        System.out.println("Remove all elements of hset2 which are in hset1");
        hset2.removeAll(hset1);
        System.out.println(hset2);

    }

    private static void EqualOrNot(HashSet<String> hset1, HashSet<String> hset2) {
        
       if(hset1.equals(hset2)){
        System.out.println("Both HashSets are equal");
    }
    else{
     System.out.println("Both HashSets not are equal");
    }
    }
    
}
