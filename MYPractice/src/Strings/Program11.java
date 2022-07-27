package Anuradha.Strings;

import java.util.Random;
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        //character lies between these
        String ch = "abcdefghijklmnopqrstuvwxyz1234567890";
        //combining lowercase & uppercase & numbers to a string
        ch = ch.toLowerCase() + ch.toUpperCase();
        //taking an empty StringBuilder to append later
        StringBuilder sb = new StringBuilder();
        //setting String length
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for a String: ");
        int length = sc.nextInt();
        sc.nextLine();
        //importing Random class and creating an object to use
        Random random = new Random();
        //for loop
        for (int i = 0; i < length; i++) {
            //generating a random integer for index
            int num = random.nextInt(ch.length());
            //getting an index for characters to form a String
            char cha = ch.charAt(num);
            //appending the character to StringBuilder
            sb.append(cha);
        }
        //Printing the generated String
        System.out.println(sb);
    }
}

