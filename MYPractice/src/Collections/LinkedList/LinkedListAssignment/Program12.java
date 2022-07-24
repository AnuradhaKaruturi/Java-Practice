package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;

//remove specified element from the list
public class Program12 {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("apple");
        linkedList.add("mango");
        linkedList.add("kiwi");
        linkedList.add("banana");
        linkedList.add("pear");
        System.out.println("Linked list is :"+linkedList);
        linkedList.remove("kiwi");
        System.out.println("List after removing kiwi :"+linkedList);
    }
    
}
