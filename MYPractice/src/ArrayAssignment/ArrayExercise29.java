
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise29 {

    public static void main(String[] args) {

    int[][] arr1 = new int[3][3]; 
    int[][] arr2 = new int[3][3];
    int[][] mul = new int[3][3];
   
    Scanner sc = new Scanner(System.in); 
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

    for(int i=0;i<3;i++)
{    
    for(int j=0;j<3;j++)
    {    
        mul[i][j]=0;      

        for(int k=0;k<3;k++)      
        {      
            mul[i][j]+=arr1[i][k]*arr2[k][j];      
        }  
        System.out.print(mul[i][j]+" ");   
    }
    System.out.println();   
}    
}
    
}
