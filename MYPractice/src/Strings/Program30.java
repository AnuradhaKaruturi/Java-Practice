package Anuradha.Strings;

import java.util.Scanner;

//Remove all WhiteSpaces from a string
public class Program30 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println("Printing String before WhiteSpace Removal: " + string);
        string = string.replace(" ", "");
        System.out.println("Printing String After WhiteSpace Removal: " + string);

        /*
        Output:
        Enter a String:
        This is a String after whitespace removal
        Printing String before WhiteSpace Removal: This is a String after whitespace removal
        Printing String After WhiteSpace Removal: ThisisaStringafterwhitespaceremoval
         */
    }
}