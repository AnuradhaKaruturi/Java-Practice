package Searching;

import java.util.Scanner;

public class LineraSearching {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);  
         System.out.print("Enter the number of elements in the list: ");  
         int n = sc.nextInt();
         int[] array = new int[n];  
         System.out.println("Enter the elements of the array: ");  
         for(int i=0; i<n; i++)  
           {  
             array[i]=sc.nextInt();  
           }  
        printArr(array);
        System.out.print("Enter the key for search :");  
         int key = sc.nextInt();
         linearSearch(array,key);
        sc.close();

    }

    private static void linearSearch(int[] array, int key) {
        int i , size = array.length-1;
        for( i = 0 ; i < size;i++){
            if (array[i] == key)     
            {  
                 System.out.println(key + " is present at index " + i +" in the array");  
                break;  
            }
        }
        if(i == size){
            System.out.println(key + " doesn't exist in array.");
        }
    
    }
    private static void printArr(int[] array) {
    System.out.println("Array elements are: ");  
    for (int i=0; i<array.length; i++)   
      {  
      System.out.println(array[i]);  
       } 
    }
}
