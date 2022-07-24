package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;
//retrieve last element
public class Program21 {

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(" List  elements :"+list);
        int num = list.getLast();
        System.out.println(" Last  elements in List :"+ num);
    }
}
