package ArrayAssignment;

import java.util.Scanner;

public class ArrayExercise32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Jagged Array of sizes 2,3,4,");
        int arr1[][] = new int[3][];
        arr1[0] = new int[2];
        arr1[1] = new int[3];
        arr1[2] = new int[4];

        for(int i = 0; i< arr1[0].length;i++){
           arr1[0][i] = sc.nextInt();
        }
        for(int i = 0; i< arr1[1].length;i++){
            arr1[1][i] = sc.nextInt();
         }
         for(int i = 0; i< arr1[2].length;i++){
            arr1[2][i] = sc.nextInt();
         }

         for(int i=0; i < arr1.length; i++){
            System.out.println();
            for(int j=0; j < arr1[i].length; j++){
               System.out.print(arr1[i][j] + " ");
            }
         }

         System.out.println();
         System.out.println("Enter Second Jagged Array of sizes 2,3,4,");
        int arr2[][] = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[4];

        for(int i = 0; i< arr2[0].length;i++){
            arr2[0][i] = sc.nextInt();
        }
        for(int i = 0; i< arr2[1].length;i++){
            arr2[1][i] = sc.nextInt();
         }
         for(int i = 0; i< arr2[2].length;i++){
            arr2[2][i] = sc.nextInt();
         }

         sc.close();
         for(int i=0; i < arr2.length; i++){
            System.out.println();
            for(int j=0; j < arr2[i].length; j++){
               System.out.print(arr2[i][j] + " ");
            }
         }

         System.out.println();
         int arr3[][] = new int[3][];
         arr3[0] = new int[2];
         arr3[1] = new int[3];
         arr3[2] = new int[4]; 
         System.out.println("Sum of two Jagged Arrays :");
         for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }


    }
    
}
