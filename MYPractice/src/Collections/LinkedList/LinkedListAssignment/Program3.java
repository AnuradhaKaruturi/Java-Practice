package Collections.LinkedList.LinkedListAssignment;

import java.util.Iterator;
import java.util.LinkedList;

public class Program3 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("java");
        list.add("cpp");
        list.add("angular");
        list.add("python");
        list.add("javaScript");
        Iterator<String> iter = list.listIterator(1);
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    
}
