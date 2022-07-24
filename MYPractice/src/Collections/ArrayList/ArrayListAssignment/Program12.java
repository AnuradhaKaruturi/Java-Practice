package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//Extract portion of List
public class Program12 {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Guava");
        fruits.add("mango");
        fruits.add("pear");
        fruits.add("starFruit");

        System.out.println("List of Fruits are :"+ fruits);
        List<String> newlist = fruits.subList(2, 5);
        System.out.println("subList of Fruits are :"+ newlist);
        
    }
    
}
