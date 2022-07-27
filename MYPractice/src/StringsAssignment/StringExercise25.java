package StringsAssignment;

import java.util.Arrays;
import java.util.Scanner;
public class StringExercise25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two String to test for anagram");
        String s1 = validate(sc);
        String s2 = validate(sc);
        sc.close();
       char str[] = s1.toCharArray();
       char str1[] = s2.toCharArray();
        if (areAnagram(str, str1))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
    }
    public static boolean areAnagram(char[] str ,char[] str1){

        int n = str.length;
        int n1 = str1.length;

        if(n != n1)
           return false;

        Arrays.sort(str);
        Arrays.sort(str1);

        for(int i= 0;i < n ;i++){
            if(str[i] != str1[i])
               return false;
        }

        return true;

    }



    static String validate(Scanner scannerObj){ //validate method definition
        String st;
        do{
            System.out.println("Enter String:");
            while(!scannerObj.hasNext("[A-Za-z]*")){
                System.out.println("This is not a String.Please enter valid String:");
                scannerObj.next();
            }
            st = scannerObj.nextLine();
        }while(st.equals(""));
      return st;
    }
}

