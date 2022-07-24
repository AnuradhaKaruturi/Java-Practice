package Collections.ArrayList.ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

//compare two lists
public class Program17 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("rose");
        list1.add("lily");
        list1.add("daisy");
        System.out.println("List1 elements :"+list1);

        List<String> list2 = new ArrayList<>();
        list2.add("rose");
        list2.add("lily");
        list2.add("daisy");
        System.out.println("List2 elements :"+list2);

        List<String> list3 = new ArrayList<>();
        list3.add("apple");
        list3.add("mango");
        list3.add("kiwi");
        System.out.println("List3 elements :"+list3);

        System.out.println("List1 and List2 equal  : "+list1.equals(list2));
        System.out.println("List1 and List3 equal  : "+list1.equals(list3));
    }
}
