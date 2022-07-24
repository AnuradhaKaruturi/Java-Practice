package practice.Arrays;

import java.util.Scanner;

public class TwoDimentionalArray {

    public static void main(String[] args) {
    
    int[][] arr = new int[3][3];

    System.out.println("Enter values for 3x3 matrix");
    Scanner sc = new Scanner(System.in);
    //reading input for array from console
    for(int i = 0;i< arr.length;i++){
        for(int j = 0; j<arr.length; j++){
            arr[i][j] = sc.nextInt();
        }
    }
   sc.close();
    //printing the array
    for(int i = 0;i<3;i++){
        for(int y = 0;y<3;y++){
           System.out.print(arr[i][y]+" ");
        }
        System.out.println();
    }
   //initialisation of 2-D array
    int arr1[][]={{1,2,3},{2,4,5},{4,4,5}};  
    //printing 2D array  
    for(int i=0;i<3;i++){  
    for(int j=0;j<3;j++){  
    System.out.print(arr1[i][j]+" ");  
    }  
    System.out.println();  
}  

}

}
