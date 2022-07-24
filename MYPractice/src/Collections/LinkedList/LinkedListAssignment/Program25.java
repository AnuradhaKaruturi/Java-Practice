package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;
//list is empty or not
public class Program25 {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("List elements "+list1);
        System.out.println("List is Empty ? :"+list1.isEmpty());
        list1.clear();
        System.out.println("List elements "+list1);
        System.out.println("List is Empty ? :"+list1.isEmpty());
    }
    
}
