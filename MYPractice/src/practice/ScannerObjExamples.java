package practice;
import java.util.Scanner;
public class ScannerObjExamples {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(" Enter integer value for A: ");
        int a = obj.nextInt();
        System.out.println(" Enter integer value for B: ");
        int b = obj.nextInt();
        obj.nextLine();
        System.out.println(" Enter a Sentence ");
        String abc = obj.nextLine();
        System.out.println("Enter any Character  ");
        char ch = obj.next().charAt(0);
         System.out.println(" enter any words : ");
         String str1 = obj.next();
         System.out.println(" enter any words : ");
         String str2 = obj.next();
         System.out.println("sum of A and B : "+(a+b) );
         System.out.println("Entered sentence and character is "+ch+" "+abc);
        System.out.println("Concatination of String 1 and String2 "+str1+str2);
        System.out.println(" enter Address to find specified Pattern : ");
         String address = obj.nextLine();
         System.out.println(address);
         System.out.println("pattern Found :"+obj.findInLine("Kukatpally"));
         System.out.println(obj.nextLine());
    obj.close();
    }
}