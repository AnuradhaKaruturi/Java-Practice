package Collections.LinkedList.LinkedListCodingAssignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("List elemenets :"+list);
        isPalindrome(list);
       
        LinkedList<Integer> newlist = new LinkedList<Integer>();
        newlist.add(1);
        newlist.add(2);
        newlist.add(3);
        System.out.println("List elemenets :"+newlist);
        isPalindrome(newlist);
       
    }

    private static void isPalindrome(LinkedList<Integer> list) {

        Object revlist = list.clone();
        Collections.reverse((List<?>) revlist);

        if(list.equals(revlist)){
            System.out.println("LinkedList is palindrome");
        }
        else{
            System.out.println("LinkedList is not a palindrome");
        }
        
    }

   

    
}
