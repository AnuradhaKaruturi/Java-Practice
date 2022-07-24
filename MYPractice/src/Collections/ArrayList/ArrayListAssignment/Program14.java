package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//empty the list
public class Program14 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Guava");
        fruits.add("mango");

        System.out.println("List of Fruits are :"+ fruits);
        fruits.clear();
        System.out.println("List of Fruits after clear :"+ fruits);

        
    }
    
}
