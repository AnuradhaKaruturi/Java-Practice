package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;

//didplay elements at thier positions
public class Program11 {

    public static void main(String[] args) {
        
    LinkedList<String> linkedList = new LinkedList<String>();
    linkedList.add("apple");
    linkedList.add("mango");
    linkedList.add("kiwi");
    linkedList.add("banana");
    for(int i = 0 ; i < linkedList.size();i++){
        System.out.println("Elements at Index :"+i+" is "+linkedList.get(i));
    }
    }
    
}
