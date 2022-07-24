
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise24{

public static void main(String[] args) {
    int row, col,count = 0,size;
    int[][] twodArray = new int[3][3]; // declared and created array object
    Scanner sc = new Scanner(System.in); // created Scanner object
    System.out.println("Please enter the values to be added for a 3X3 Sparse matrix");
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

    size = row*col;
    
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
           if(twodArray[i][j] == 0){
               count++;
           }
        }
    }
    if(count > (size/2)){
        System.out.println("Entered matrix is sparse Matrix");
    }
    else
      System.out.println("entered matrix is not a Sparse Matrix");
}
}
