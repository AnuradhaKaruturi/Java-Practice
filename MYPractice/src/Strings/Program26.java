package Anuradha.Strings;

import java.util.Arrays;
import java.util.Scanner;

//Divide a String N equal parts
public class Program26 {
    public static void main(String[] args) {
        /*String s="This is a String and a good one";
        int length=s.length();
        int n=s.length()/2;
        //int temp
        String[] s_Arr=s.split(" ",n);
        System.out.println(Arrays.toString(s_Arr));*/
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        //reading input
        String string = sc.nextLine();
        int length = string.length();
        System.out.println("String Length: " + length);
        //reading n value from console
        System.out.println("Enter N Value: ");
        int n = sc.nextInt();
        sc.nextLine();
        //String str="This is String Division into Parts";
        //The String after division into 17 parts:
        // [Th, is,  i, s , St, ri, ng,  D, iv, is, io, n , in, to,  P, ar, ts]
        //array index
        int temp = 0;
        //chars value for iteration
        int chars = length / n;
        //to store divided String elements. Size of the array is n
        String[] s_Arr = new String[n];
        //as we have to divide into equal parts remainder must be 0
        if (length % n != 0) {
            System.out.println("The given String can't be divided in to " + n + " equal parts");
        }
        //If the remainder is 0
        else {
            //looping through the String length by length quotient incrementing the iteration
            for (int i = 0; i < length; i += chars) {
                //String element= substring of the string like (0,0+chars value) ex:(charAt(0),charAt(0+chars-1)
                String element = string.substring(i, i + chars);
                //now temp=0,s_Arr[0...]=element
                s_Arr[temp] = element;
                //index temp increments by 1 till iteration breaks
                temp++;
            }
            //Printing the divided String in an Array
            System.out.println("The String after division into " + n + " parts: " + Arrays.toString(s_Arr));
        }
    }
}
