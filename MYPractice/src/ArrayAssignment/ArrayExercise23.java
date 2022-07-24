
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise23 {

    public static void main(String[] args) {
        int row, col;
        boolean flag = true;
        int[][] twodArray = new int[3][3]; // declared and created array object
        Scanner sc = new Scanner(System.in); // created Scanner object
        System.out.println("Please enter the values to be added for a 3X3 square matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twodArray[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
        System.out.println("Entered Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twodArray[i][j] + " ");
            }
            System.out.println();
        }

        row = twodArray.length;
        col = twodArray[0].length;

        if (row != col) {
            System.out.println("Please enter a Square matrix");
        }

        else {

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {

                    if(i==j && twodArray[i][j] != 1){
                        flag = false;
                    }

                    if(i !=j && twodArray[i][j] != 0){
                        flag = false;
                    }

                }
            }

        }

        if(flag)    
                System.out.println("Given matrix is an identity matrix");    
            else    
                System.out.println("Given matrix is not an identity matrix");    
    }

}
