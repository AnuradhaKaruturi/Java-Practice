package Anuradha.Strings;

public class Program5 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = s1;

        String st1 = new String("Money");
        String st2 = st1;

        String s3 = "Apple";
        String s4 = "apple";

        String str1 = new String("Apple");
        String str2 = new String("ApplE");

        System.out.println("Is s1==s2: " + (s1 == s2));//true
        System.out.println("Is st1==st2: " + (st1 == st2));//true
        System.out.println("Is s3==s4: " + (s3 == s4));//false
        System.out.println("Is s3==str1: " + (s3 == str1));//false
        System.out.println("Is str1==str2: " + (str1 == str2));//false
    }
}
