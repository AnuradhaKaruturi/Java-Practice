
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise28 {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        int even = 0,odd = 0;
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


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if(arr[i][j] % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }

        System.out.println("Frequency of EVEN numbers in given Matrix is :"+even);
        System.out.println();
        System.out.println("Frequency of ODD numbers in given Matrix is :"+odd);
    }
    
}
