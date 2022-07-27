package StringsAssignment;

import java.util.Scanner;
public class StringExercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with punctuation marks of your choice "+"!,;.?-'\'''\"':");
        String str = sc.nextLine();
        sc.close();
        int count = 0;
        for(int i= 0;i<str.length();i++)
        {
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||  
            str.charAt(i) == '\'' || str.charAt(i) == '\"' ||  str.charAt(i) == ':' ) {  
                count++;
            }
        }
        System.out.println("Entered string is :"+str+"\n"+ "Count of punctuation marks is"+count);    }

}
