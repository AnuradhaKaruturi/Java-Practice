package Collections.LinkedList.LinkedListAssignment;
//clone linkedlist
import java.util.LinkedList;

public class program18 {

    public static void main(String[] args) {
        
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("Original List :"+list1);
        Object list2 = list1.clone();
        System.out.println("Cloned list "+list2);
    }
    
}
