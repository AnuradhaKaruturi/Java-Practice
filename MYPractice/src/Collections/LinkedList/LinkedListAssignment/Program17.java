package Collections.LinkedList.LinkedListAssignment;
//joining two lists
import java.util.LinkedList;

public class Program17 {

    public static void main(String[] args) {
        
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(40);
        list2.add(50);
        list2.add(60);

        System.out.println("List elements :"+list1);
        System.out.println("List elements :"+list2);
        list1.addAll(list2);
        System.out.println("List elements after joining Two Lists :"+list1);
    }
}
