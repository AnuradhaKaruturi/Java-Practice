
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise17 {

    public static void main(String[] args) {

        int[] intArr = new int[5];
        int len = intArr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer values :");
        for (int i = 0; i < len; i++) {
            intArr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Entered values are");
        for (int n : intArr) {
            System.out.print(n + " ");
        }

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
        System.out.println();
        System.out.println("2nd Largest Number in the array is :" + intArr[len - 2]);
    }

}
