package Collections.LinkedList.LinkedListAssignment;

import java.util.LinkedList;
import java.util.Scanner;
//element is present in the list or not
public class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(" List  elements :"+list);
        System.out.println("Enter elements to search :");
        int element = sc.nextInt();
        boolean flag = list.contains(element);
        if(flag){
            System.out.println("Element "+element+" is present in the List");
        }
        else{
            System.out.println("Element "+element+" is not present in the List");
        }
        sc.close();
    }
    
}
