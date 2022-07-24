package Collections.HashSet.HashSetAssignment;

import java.util.Arrays;
import java.util.HashSet;

public class Program13 {
//Array to Set and Vice-verse
    public static void main(String[] args) {

        System.out.println("Array to HashSet");
        String arr[] = {"one", " two","three","four"};
        System.out.println("Array elements :");
        for(String s : arr){
            System.out.println(s);
        }
        HashSet<String> set = new HashSet<String>(Arrays.asList(arr));
        System.out.println("HashSet elements :");
        System.out.println(set);

        System.out.println("HashSet to Array");
        HashSet<String> hset = new HashSet<String>();
        hset.add("rose");
        hset.add("lily");
        hset.add("daisy");
        System.out.println("HashSet elements :");
        System.out.println(hset);
        hset.toArray();
        System.out.println("Array Elements :");
        for(String s : hset){
            System.out.println(s);
        }
  


        
    }
    
}
