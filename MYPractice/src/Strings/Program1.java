package Anuradha.Strings;

import java.util.Scanner;

//Java Program to count vowels,consonants,digits and spaces in a String
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        //Enter string as input
        String string = sc.nextLine();
        //Converting string to lowercase to lessen code logic
        string = string.toLowerCase();
        //System.out.println(string);
        //for counting
        int count = 0;
        //converting string to char array
        char[] carr = string.toCharArray();
        //looping through array of characters
        for (int i = 0; i < carr.length; i++) {
            //vowel condition, carr[0,1,2....]==a/e/i/o,u
            if ((carr[i] == 'a') | (carr[i] == 'e') | (carr[i] == 'i') | (carr[i] == 'o') | (carr[i] == 'u')) {
                //if true count increments by 1
                count++;
            }
        }
        //Prints Vowel Count
        System.out.println("Vowel count: " + count);
        //setting count to 0 again
        count = 0;
        for (int i = 0; i < carr.length; i++) {
            //consonant condition, carr[0,1,2....]== other alphabets other than a/e/i/o,u
            if ((carr[i] == 'b') | (carr[i] == 'c') | (carr[i] == 'd') | (carr[i] == 'f') | (carr[i] == 'g')
                    | (carr[i] == 'h') | (carr[i] == 'j') | (carr[i] == 'k') | (carr[i] == 'l') | (carr[i] == 'm') |
                    (carr[i] == 'n') | (carr[i] == 'p') | (carr[i] == 'q') | (carr[i] == 'r') | (carr[i] == 's') |
                    (carr[i] == 'z') | (carr[i] == 't') | (carr[i] == 'v') | (carr[i] == 'w') | (carr[i] == 'x') | (carr[i] == 'y')) {
                //if true count increments by 1
                count++;
            }
        }
        //Prints Consonant Count
        System.out.println("Consonant count: " + count);
        //Setting count to 0 again
        count = 0;
        for (int i = 0; i < carr.length; i++) {
            //number condition, carr[0,1,2....]==1/2/3/4/5/6/7/8/9/0
            if ((carr[i] == '1') | (carr[i] == '2') | (carr[i] == '3') | (carr[i] == '4') | (carr[i] == '5') |
                    (carr[i] == '6') | (carr[i] == '7') | (carr[i] == '8') | (carr[i] == '9') | (carr[i] == '0')) {
                //if true count increments by 1
                count++;
            }
        }
        //Prints digit count
        System.out.println("Digit count: " + count);
        //Setting count to 0 again
        count = 0;
        for (int i = 0; i < carr.length; i++) {
            //Space condition, carr[0,1,2....]==whitespace
            if ((carr[i] == ' ')) {
                //if true count increments by 1
                count++;
            }
        }
        //Prints Space count
        System.out.println("Space count: " + count);
    }
}