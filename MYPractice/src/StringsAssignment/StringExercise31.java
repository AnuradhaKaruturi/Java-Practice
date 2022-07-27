package StringsAssignment;

import java.util.Scanner;
public class StringExercise31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        sc.close();
        StringBuffer str = new StringBuffer(s);
        convertOpposite(str);
        System.out.println(str);
    }

    static void convertOpposite(StringBuffer str)
    {
        for(int i= 0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                str.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
    }
}