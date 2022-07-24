package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;
import java.util.ListIterator;
//iterate through all the elements
public class Program2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("java");
        list.add("cpp");
        list.add("angular");
        list.add("python");
        ListIterator<String> iter = list.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
