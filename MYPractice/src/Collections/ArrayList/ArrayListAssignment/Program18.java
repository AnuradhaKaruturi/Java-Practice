package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;

//trim to capacity
public class Program18 {

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

      list.trimToSize();
      System.out.println("The List elements are:" + list);
  
    }
    
}
