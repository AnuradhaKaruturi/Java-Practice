
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise38 {

    public static void main(String[] args) {
    
        int[][] arr = new int[3][3];
        int[][] tranArr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the values to be added for a 3X3  matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
        System.out.println("Entered Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        Transpose(arr,tranArr);
    }


public static void Transpose(int[][] arr, int[][] tranArr){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tranArr[i][j] = arr[j][i];
            }
        }

        System.out.println("Transpose of given Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tranArr[i][j] + " ");
            }
            System.out.println();
        }
    }


    }    
    
    

