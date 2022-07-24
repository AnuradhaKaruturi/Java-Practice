package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;

//first asnd last occurence of element in linikedlist
public class Program10 {

    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("banana");
        linkedList.add("apple");
        linkedList.add("mango");
        linkedList.add("kiwi");
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("apple");
        linkedList.add("grape");

        System.out.println("Actual List : "+ linkedList);

        int i = linkedList.indexOf("apple");
        System.out.println("First Occurence of apple at  Index: " + i);
   
        // Get the last index of Apple
        i = linkedList.lastIndexOf("apple");
        System.out.println("Last Occurence of apple at  Index: " + i);
    }
    
}
