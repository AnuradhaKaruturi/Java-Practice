package Anuradha.Strings;

import java.util.Arrays;
import java.util.Scanner;

//Whether the given String is palindrome or not
public class Program33 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        //convert string to array
        char[] chars=string.toCharArray();
        //Taking an array with the same length of chars array
        char[] reverse=new char[chars.length];
        //looping through chars array
        for(int i=0;i<chars.length;i++){
            //passing last index value of chars array in to reverse array's first index
            reverse[i]=chars[reverse.length-i-1];
        }
        //if chars[i].equals(reverse[i])
        if(Arrays.toString(chars).equals(Arrays.toString(reverse))){
            System.out.println("The given String is a Palindrome!!!");
        }else{
            System.out.println("The given String is not a Palindrome!!!");
        }
    }
}