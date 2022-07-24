package ArrayAssignment;

import java.util.Scanner;

public class ArrayExercise25 {
    public static void main(String[] args) {

    int row1, col1,row2,col2;
    int[][] arr1 = new int[3][3]; // declared and created array object
    int[][] arr2 = new int[3][3];
    boolean flag = true;
    Scanner sc = new Scanner(System.in); // created Scanner object
    System.out.println("Please enter the values to be added for a 3X3 first matrix");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            arr1[i][j] = sc.nextInt();
        }
        System.out.println();
    }
    System.out.println("Please enter the values to be added for a 3X3 second matrix");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            arr2[i][j] = sc.nextInt();
        }
        System.out.println();
    }
    sc.close();
    System.out.println("Entered Matrix is:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(arr1[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Entered Matrix is:");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(arr2[i][j] + " ");
        }
        System.out.println();
    }
    row1 = arr1.length;
    col1 = arr1[0].length;

    row2 = arr2.length;
    col2 = arr2[0].length;


    if(row1 != row2 || col1 != col2){    
        System.out.println("Matrices are not equal");    
    }    
    else {    
        for(int i = 0; i < row1; i++){    
            for(int j = 0; j < col1; j++){    
                if(arr1[i][j] != arr2[i][j]){
                    flag = false;
                    break;

                }
            }
        }

        if(flag)
        System.out.println("Matrices are  equal"); 
        else
        System.out.println("Matrices are not equal"); 
    }
}
    
}
