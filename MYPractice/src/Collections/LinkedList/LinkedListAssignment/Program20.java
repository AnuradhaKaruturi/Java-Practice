package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;
//retrieve firstElement
public class Program20 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(" List  elements :"+list);
        int num = list.getFirst();
        System.out.println(" First  elements in List :"+ num);
    }
}
