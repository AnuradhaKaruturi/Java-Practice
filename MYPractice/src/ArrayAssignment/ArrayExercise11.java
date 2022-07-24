package ArrayAssignment;

import java.util.Scanner;

public class ArrayExercise11 {

    public static void main(String[] args) {
        
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

    System.out.println("Number of elements in Array is :"+intArr.length);
    }
    
}
