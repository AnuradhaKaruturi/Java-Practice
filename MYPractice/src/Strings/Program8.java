package Anuradha.Strings;

import java.util.Scanner;

//Check if a String is Numeric
public class Program8 {
    public static void main(String[] args) {
        /*String num_string="52890";
        int number=Integer.parseInt(num_string);
        System.out.println("The Numeric in this String: "+number);
        if((number-number)==0){
            System.out.println("The Number From String Is Numeric");
        }else{
            System.out.println("The Number is still a String");
        }*/
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        //reads input from console
        String s = sc.nextLine();
        //pattern between 0 and 9,+ means repeat
        String pattern = "[0-9]+";
        //if string matches the pattern values its true
        if (s.matches(pattern)) {
            System.out.println("String is numeric");
        } else {
            System.out.println("String is not numeric");
        }
    }
}
