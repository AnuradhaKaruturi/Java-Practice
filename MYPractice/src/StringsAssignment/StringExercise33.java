package StringsAssignment;

import java.util.Scanner;
public class StringExercise33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sc.close();
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        String newstr = str.toString();
        if(s.equals(newstr)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not a  Palindrome");
        }
    }
}
        