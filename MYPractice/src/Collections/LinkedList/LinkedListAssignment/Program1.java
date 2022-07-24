package Collections.LinkedList.LinkedListAssignment;

import java.util.Iterator;
import java.util.LinkedList;

//append elenment to end of thr linkedList
public class Program1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("hello");
        list.add("wow");
        list.add("Good");
        list.add("surprise");
        Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
        }
    }
    
}
