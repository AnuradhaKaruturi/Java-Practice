package Anuradha.Strings;

import java.util.Scanner;

//Check if one String is rotation of the other
public class Program34 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Enter a String: ");
        String s2 = sc.nextLine();
        sc.close();
        if(s1.length()!=s2.length()){
            System.out.println(s2+" cannot be a rotation of "+s1);
        } else {
            //concatenating s1 and s2 and passing it into s1
            s1= s1+s2;
            //if s1 contains s2 rotation of string is there
            if(s1.contains(s2))  {
                System.out.println(s2+" is a rotation of "+s1);
            } else {
                System.out.println(s2+" cannot be a rotation of "+s1);
            }
        }
    }
}
/*
goMan is a rotation of MangogoMan
 */
