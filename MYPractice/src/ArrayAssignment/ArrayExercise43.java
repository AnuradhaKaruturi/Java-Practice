
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise43 {

    public static void main(String[] args) {
        int[] intArr = new int[10];
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter 10 integer values :");
        for(int i = 0;i< intArr.length;i++){
            intArr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Entered values are");
        for(int n:intArr){
            System.out.print(n+" ");
        }  

        System.out.println("Enter an integer value to check whether"+"\n"+" it is present in given array or not");
        int val = sc.nextInt();

        for(int n : intArr){
            if(n == val)
               System.out.println("Given value "+val+" is present in array");
            else
            System.out.println("Given value "+val+" is not present in array");
        }
    }
    
}
