package practice.Arrays;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {

    float floatArr[] = {10.0f,20.0f,30.0f};
    System.out.println(floatArr);
    System.out.println(floatArr[0]);
    System.out.println(floatArr[2]);


    int[] intArr = new int[5];
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter 5 integer values :");
    for(int i = 0;i< intArr.length;i++){
        intArr[i]=sc.nextInt();
    }
    sc.close();
  System.out.println("Entered values are");
    for(int n:intArr){
        System.out.print(n+" ");
    }

System.err.println();
String[] str = {"abc","bcd","xyz"};
System.out.println("String length is");
System.out.println(str.length);

    printArray(str); //pasing array to method
    }

    static void printArray(String[] str){  //passing stringArray to method
        
        for(String s:str){
            System.out.println(s);
        }

    }
}
