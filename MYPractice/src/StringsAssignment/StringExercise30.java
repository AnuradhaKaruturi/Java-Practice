package StringsAssignment;

import java.util.Scanner;
public class StringExercise30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        sc.close();
        String newStr = str.replace(" ","");
      //  String newStr = str.replaceAll("\\s", "");
        System.out.println(newStr);
    }
}
