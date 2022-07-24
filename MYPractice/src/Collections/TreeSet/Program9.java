package Collections.TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Program9 {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(4);
        set.add(10);
        set.add(3);
        set.add(9);
        set.add(12);

        System.out.println("Original Set :"+set);
        System.out.println("Elements less than 7 in set are : "+ set.headSet(7));

        //prog10
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        tree_num.add(22);
   tree_num.add(36);
   tree_num.add(32);
   tree_num.add(16);
   tree_num.add(70);
   tree_num.add(82);
   tree_num.add(12);
   System.out.println("TreeSet elements "+tree_num);
   System.out.println("element greater than or equal to the given element 32 is :" + tree_num.ceiling(32));   
   //prog11
   System.out.println("element greater than or equal to the given element 82 is :" + tree_num.floor(82));

   //Prog12
   System.out.println("Strictly greater than 70 : "+tree_num.higher(70));
    
    //Prog13
   System.out.println("Strictly greater than 16 : "+tree_num.lower(16));

   //prog14
   System.out.println("Removes the first element: "+tree_num.pollFirst());

   //prog15
   System.out.println("Removes the last element: "+tree_num.pollLast());

    //prog16
    System.out.println("Removes the given  element 70: "+tree_num.remove(70));
    System.out.println("TreeSet elements after removing 70 : "+tree_num);


}
    
}
