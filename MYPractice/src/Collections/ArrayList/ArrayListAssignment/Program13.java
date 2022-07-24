package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//replace second elemnent with specified element
public class Program13 {

    public static void main(String[] args) {
        
        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Guava");
        fruits.add("mango");

        System.out.println("List of Fruits are :"+ fruits);
        fruits.set(1, "kiwi");
        System.out.println("After replacing the second elements of Fruits :"+ fruits);
    }
    
}
