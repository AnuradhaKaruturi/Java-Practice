
package ArrayAssignment;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise41 {

    public static void main(String[] args) {
        int[] intArr1 = new int[5];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 5 integer values :");
        for(int i = 0;i< intArr1.length;i++){
            intArr1[i]=sc.nextInt();
        }

            int[] intArr2 = new int[5];
            
             System.out.println("Enter 5 integer values :");
            for(int i = 0;i< intArr2.length;i++){
                intArr2[i]=sc.nextInt();
            }

            int n = intArr1.length+intArr2.length;
            sc.close();

            int[] concatArr = new int[n];
            System.arraycopy(intArr1, 0, concatArr, 0, intArr1.length);
            System.arraycopy(intArr2, 0, concatArr, intArr1.length, intArr2.length);

            System.out.println(Arrays.toString(concatArr));
        }
}
