package Java8.StreamAPI.CollectorClassMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/*
After performing the intermediate operations on elements in the stream,
 we can collect the processed elements again into a Collection using the stream Collector methods.
 */
public class CollectasToList {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
      }

      Integer[] evenNumArr = list.stream().filter(i -> i%2 == 0).toArray(Integer[]::new);
      System.out.print("Even Numbers Array: "+ evenNumArr);
      
      List<Integer> oddNumList = list.stream().filter(x->x%2 != 0 ).collect(Collectors.toList());
      List<Integer> evenNumList = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
      System.out.print("Even Numbers : "+ evenNumList);
      System.out.println();
      System.out.print("Odd Numbers : "+ oddNumList);

      System.out.println(  );
      Set<Integer> oddNumSet = list.stream().filter(x->x%2 != 0 ).collect(Collectors.toSet());
      System.out.print("Odd Numbers Set : "+ oddNumSet);
 
      
    }


    
}
