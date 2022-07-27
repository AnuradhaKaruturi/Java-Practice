package Anuradha.Strings;

//Compare String Objects using == operator
public class Program7 {
    public static void main(String[] args) {
        String str1=new String(" ");

        String str2=" ";

        String str3=new String(" ");

        String one=new String("First");
        String two=new String("Second");

        String three=new String("Phone");
        String four=new String("Phone");

        String five=four.toLowerCase();

        System.out.println("Is str1==str2: "+(str1==str2));//false
        System.out.println("Is str1==str3: "+(str1==str3));//false
        System.out.println("Is one==two: "+(one==two));//false
        System.out.println("Is three==four: "+(three==four));//false
        System.out.println("Is four==five: "+(five==four));//false
    }
}
