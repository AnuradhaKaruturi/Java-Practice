package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//Serach ana element in ArrayList
public class Program7 {
    public static void main(String[] args) {
        
        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Guava");
        fruits.add("mango");
        fruits.add("pear");
        fruits.add("starFruit");

        System.out.println("List of Fruits are :"+ fruits);
        System.out.println("Does the list Contains Mango :" +fruits.contains("mango"));
        System.out.println("Does the list Contains Orange :" +fruits.contains("orange"));

    }
    
}
