
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise3 {

    public static void main(String[] args) {
        int[] intArr = new int[5];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 5 integer values :");
        for(int i = 0;i< intArr.length;i++){
            intArr[i]=sc.nextInt();
        }

        System.out.println("Enter number of times for left rotate array ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Entered values are");
        for(int n:intArr){
            System.out.print(n+" ");
        }   
        System.out.println();
        System.out.println("Number of left rotations: "+num);
        
        rotateLeft(intArr, num);
         
    }

    public static void rotateLeft(int[] intArr,int num){
        for(int i = 0;i<num;i++){
            int first,j;
            first = intArr[0];
            for( j = 0;j< intArr.length-1;j++){
                intArr[j] = intArr[j+1];
            }
            intArr[j] = first;
        }

        System.out.println();
        System.out.println("Array after rotating :");

        for(int x:intArr){
            System.out.print(x+" ");
        }

    }
    
}
