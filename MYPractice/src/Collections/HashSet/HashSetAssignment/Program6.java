package Collections.HashSet.HashSetAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Program6 {
 

    public static void main(String[] args) {
    
    HashSet<String> hset = new HashSet<String>();
    hset.add("cat");
    hset.add("dog");
    hset.add("fish");
    hset.add("monkey");
    hset.add("parrot");
    System.out.println("Original HashSet :"+hset);
    Object clonedhset =  hset.clone();
    System.out.println("Cloned HashSet :"+clonedhset);

    //prog7 convert hashset to Array
    hset.toArray();
    System.out.println("Array Elements are :");
    for (String string : hset) {
        System.out.println(string);   
    }

     //prog8 convert hashset to Tree
     HashSet<String> hsetT = new HashSet<String>();
     hsetT.add("apple");
     hsetT.add("banana");
     hsetT.add("mango");
     hsetT.add("berry");
     System.out.println(" HashSet :"+hset);
     System.out.println("After converting to Tree..");
     TreeSet<String> tree = new TreeSet<>(hsetT);
     for (String string : tree) {
        System.out.println(string);   
    }
      //prog9 convert hashset to ArrayList/List
      HashSet<String> hsetL = new HashSet<String>();
      hsetL.add("one");
      hsetL.add("two");
      hsetL.add("three");
      hsetL.add("four");
      System.out.println(" HashSet :"+hsetL);
      System.out.println("After converting to List..");
      List<String> list = new ArrayList<String>(hsetL);
      for (String string : list) {
        System.out.println(string);   
    }

    }
}
