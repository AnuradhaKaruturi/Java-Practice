package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;
//removeFirst element
public class Program19 {

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(" List  elements :"+list);
        int num = list.removeFirst();
        System.out.println(" first  elements  from list :"+num);
        System.out.println(" List  elements :"+list);
    }
}
