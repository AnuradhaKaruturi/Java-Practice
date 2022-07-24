
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise13 {

    public static void main(String[] args) {
        int[] intArr = new int[5];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 5 integer values :");
        for(int i = 0;i< intArr.length;i++){
            intArr[i]=sc.nextInt();
        }

        System.out.println("Enter number of times for right rotate array ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Entered values are");
        for(int n:intArr){
            System.out.print(n+" ");
        }   
        System.out.println();
        System.out.println("Number of Right rotations: "+num);
        
        rotateRight(intArr, num);
         
    }

    public static void rotateRight(int[] intArr,int num){
        for(int i = 0;i<num;i++){
            int last,j;
            last = intArr[intArr.length-1];
            for( j = intArr.length-1;j>0;j--){
                intArr[j] = intArr[j-1];
            }
            intArr[0] = last;
        }

        System.out.println();
        System.out.println("Array after rotating :");

        for(int x:intArr){
            System.out.print(x+" ");
        }

    }
    
    
}
