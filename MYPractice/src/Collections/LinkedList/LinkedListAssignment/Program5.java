package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;

//insert element at specified position
public class Program5 {
    
    public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("anu");
        linkedList.add("siri");
        linkedList.add("vivek");
        linkedList.add("shahstra");
        System.out.println("Actual LinkedList:"+linkedList);
       linkedList.add(2, "Karunya");  
       System.out.println("After adding element at position 3 LinkedList is :"+linkedList);
    
   }
}
