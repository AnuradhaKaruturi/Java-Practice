package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;

public class Program19 {

    //increase Capacity
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(4);
 
         list.add(10);
         list.add(20);
         list.add(30);
         list.add(40);
         System.out.println("The List elements are:" + list);
         System.out.println("list size :"+list.size());
       list.ensureCapacity(100);
       System.out.println("list can store upto 100 elements now");
   
     }
 
    
}
