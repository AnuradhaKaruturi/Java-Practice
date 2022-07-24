
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise30 {

    public static void main(String[] args) {
    
    int[][] arr = new int[3][3];
    int colSum,rowSum;
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

    for(int i =0;i < 3;i++){
        rowSum =0;
        for(int j = 0;j<3;j++){
            rowSum += arr[i][j];
        }
        System.out.println("Sum of elements in "+(i+1)+" row is :"+rowSum);
    }
    System.out.println();
    for(int i =0;i < 3;i++){
        colSum =0;
        for(int j = 0;j<3;j++){
            colSum += arr[j][i];
        }
        System.out.println("Sum of elements in "+(i+1)+" row is :"+colSum);
    }

} 
}
