package Anuradha.Strings;

import java.util.Arrays;
import java.util.Scanner;
//Program to sort elements in string
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        //reads string from input
        String string = sc.nextLine();
        //converting string to lower case
        string = string.toLowerCase();
        //converting string to char array
        char[] chars = string.toCharArray();
        //Arrays.sort method sorts the array to ascending order
        Arrays.sort(chars);
        //Prints the sorted chars
    
        System.out.println("Sorted elements of String are: " + Arrays.toString(chars));

    }
}
