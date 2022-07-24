
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise9 {

    public static void main(String[] args) {
        int[] intArr = new int[6];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 6 integer values :");
        for(int i = 0;i< intArr.length;i++){
            intArr[i]=sc.nextInt();
        }

        sc.close();
        System.out.println("Entered values are");
        for(int n:intArr){
            System.out.print(n+" ");
        }  

        System.out.println();
        
        int large = intArr[0];
        for(int i = 0;i< intArr.length;i++){
          if(intArr[i] > large){
                large = intArr[i];
            }
        }
           
        System.out.println("largest element in the array is :"+large);
    }
    
}
