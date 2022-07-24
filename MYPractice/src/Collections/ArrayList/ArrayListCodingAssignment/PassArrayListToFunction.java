package Collections.ArrayList.ArrayListCodingAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class PassArrayListToFunction {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("anu");
        list.add("sree");
        list.add("hari");
        list.add("varun");
        list.add("ram");
        System.out.println("List elements :"+list);
        reverseList(list);
    }

    private static void reverseList(ArrayList<String> list) {
        Collections.reverse(list);
        System.out.println("After Reversing List elements :"+list);
    }
    
}
