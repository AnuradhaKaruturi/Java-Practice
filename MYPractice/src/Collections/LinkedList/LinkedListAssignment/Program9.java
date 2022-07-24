package Collections.LinkedList.LinkedListAssignment;


import java.util.LinkedList;
//add element at specific positions of the list 
public class Program9 {

    public static void main(String[] args) {
        
    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("apple");
    linkedList.add("mango");
    linkedList.add("kiwi");
    linkedList.add("banana");
    System.out.println("Actual List : "+ linkedList);
    linkedList.addFirst("Red");
    linkedList.addLast("Blue");
    linkedList.add(2, "rose");
    linkedList.add(4, "lily");
    System.out.println("After add element at front of the list  : "+ linkedList);

}
    
}

