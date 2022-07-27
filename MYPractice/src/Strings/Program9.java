package Anuradha.Strings;

import java.util.Arrays;
import java.util.Scanner;

//Check if two Strings are anagrams care=race bear=bare rear=rare near=earn
public class Program9 {
    public static void main(String[] args) {
        System.out.println("Enter a Word: ");
        Scanner sc = new Scanner(System.in);
        //Entering first Word
        String word1 = sc.nextLine();
        //Entering Second word
        System.out.println("Enter a Word: ");
        String word2 = sc.nextLine();
        //if same strings are entered
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println(word1 + " and " + word2 + " are same. They don't form Anagrams!!!");
        }
        //checks for equal length
        else if (word1.length() == word2.length()) {
            //converting both strings to arrays
            char[] car1 = word1.toCharArray();
            char[] car2 = word2.toCharArray();
            //sorting both arrays
            Arrays.sort(car1);
            Arrays.sort(car2);
            //if both array elements are equal
            if (Arrays.toString(car1).equals(Arrays.toString(car2))) {
                //true
                System.out.println(word1 + " and " + word2 + " are Anagrams");
            } else {
                //false
                System.out.println(word1 + " and " + word2 + " are not Anagrams");
            }
        } else {
            System.out.println("Enter words of same Length to check for Anagrams!!!");
        }

        /*String near = "near";
        String earn = "earn";
        if (near.length() == earn.length()) {
            char[] car1 = near.toCharArray();
            char[] car2 = near.toCharArray();
            Arrays.sort(car1);
            Arrays.sort(car2);
            if (Arrays.toString(car1).equals(Arrays.toString(car2))) {
                System.out.println("Near and Earn are Anagrams");
            } else {
                System.out.println("Near and Earn are not Anagrams");
            }
        }*/
    }
}