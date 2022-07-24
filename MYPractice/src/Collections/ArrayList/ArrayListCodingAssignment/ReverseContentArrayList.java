package Collections.ArrayList.ArrayListCodingAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseContentArrayList {

    public static void main(String[] args) {

        String arr[] = { "one","two" ,"three","four","five"};
        System.out.println("Array Elements are :");
        for(int i= 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
        ArrayList<String> list =  reverseStringArray(arr);
        System.out.println(" Reversed ArrayList :"+ list);

    }

    private static ArrayList<String>  reverseStringArray(String[] arr) {
       /*
        ArrayList<String> list = new ArrayList<String>();
        for(int i = arr.length-1;i >= 0;i--)
        {
            list.add(arr[i]);
        }
        */
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        Collections.reverse(list);
        return list;
    }
    
    
}
