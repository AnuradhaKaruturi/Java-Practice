package Anuradha.Strings;

import java.util.Scanner;

//Replace spaces with a specific character
public class Program32 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println("Enter a Character: ");
        char c = sc.next().charAt(0);

        sc.nextLine();
        sc.close();

        string = string.replace(' ', c);
        System.out.println("After replacing: " + string);

    }
}
/*
Output:
Enter a String:
This is String class in Java.
Enter a Character:
*
After replacing: This*is*String*class*in*Java.
 */
