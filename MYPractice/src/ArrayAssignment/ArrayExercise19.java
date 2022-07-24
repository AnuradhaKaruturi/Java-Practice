
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise19 {

    public static void main(String[] args) {

        //declaring array named intArr
        int[] intArr = new int[8];
        int len = intArr.length; //calculating length of the Array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 integer values :");
        for (int i = 0; i < len; i++) { //taking inputs for array
            intArr[i] = sc.nextInt();
        }
        sc.close();
        //printing the array
        System.out.println("Entered values are");
        for (int n : intArr) {
            System.out.print(n + " ");
        }
//sorting the array
        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (intArr[i] > intArr[j]) {
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

        int visited = -1, count = 1; //to avoid visiting the elements already visited.
        System.out.println();
        System.out.println(" elements after removing duplicates in given array:");
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (intArr[i] == intArr[j]) {
                    count++;
                    intArr[j] = visited;
                }
            }
            if (intArr[i] != visited && count > 0) {
                System.out.print(intArr[i] + " ");
            }
        }
    }

}
