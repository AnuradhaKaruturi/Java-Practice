package Collections.LinkedList.LinkedListAssignment;
//Are both lists equal?
import java.util.LinkedList;
import java.util.List;

public class Program24 {

    public static void main(String[] args) {
        
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        System.out.println("List elements :"+list1);
        System.out.println("List elements :"+list2);

        isListEqual(list1,list2);
        list2.add(40);
        System.out.println("List elements :"+list1);
        System.out.println("List elements :"+list2);
        isListEqual(list1,list2);
        
    }


    public static void isListEqual(List<Integer> list1, List<Integer> list2){
        boolean flag = list1.equals(list2);
        if(flag){
            System.out.println("Both Lists are equal");
        }
        else{
            System.out.println("Both Lists are not equal");
        }
    }
    
}
