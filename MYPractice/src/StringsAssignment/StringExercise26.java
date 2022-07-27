package StringsAssignment;

import java.util.Scanner;
public class StringExercise26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter number of parts to divide the string");
        int n = sc.nextInt();
        sc.close();
        int len = str.length();  
        int temp = 0, eachpartLen = len/n;  
        //Stores the array of string  
        String[] equalStr = new String [n];  
        if(len % n != 0) {  
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
        }  
        else {  
            for(int i = 0; i < len; i = i+eachpartLen) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+eachpartLen);  
                equalStr[temp] = part;  
                temp++;  
            }  
    System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < equalStr.length; i++) {  
                System.out.println(equalStr[i]);  
                }  
            }  
        }  


        
    }
    
