
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise14 {

    public static void main(String[] args) {
        
        int[] intArr = new int[5];
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter 5 integer values :");
    for(int i = 0;i< intArr.length;i++){
        intArr[i]=sc.nextInt();
    }
    sc.close();
    System.out.println("Entered values are");
    for(int n:intArr){
        System.out.print(n+" ");
    }

    int temp;
    for(int i = 0; i<intArr.length;i++){
        for(int j = i+1;j<intArr.length;j++){
            if(intArr[i] > intArr[j]){
                temp = intArr[i];
                intArr[i] = intArr[j];
                intArr[j] = temp;
            }
        }
    }
    System.out.println();
    System.out.println("Sorted array in Ascending order :");
    for(int n:intArr){
        System.out.print(n+" ");
    }
}
}
