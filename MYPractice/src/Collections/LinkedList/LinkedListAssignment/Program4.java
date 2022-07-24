package Collections.LinkedList.LinkedListAssignment;

import java.util.Iterator;
import java.util.LinkedList;



//iterate linked list in  reverse order 
public class Program4 {

    public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("anu");
        linkedList.add("siri");
        linkedList.add("ram");
        linkedList.add("hari");
        linkedList.add("vivek");
        linkedList.add("shahstra");
        System.out.println("Actual LinkedList:"+linkedList);
        Iterator<String> iterator = linkedList.descendingIterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
     
           }    
   }
    
}
