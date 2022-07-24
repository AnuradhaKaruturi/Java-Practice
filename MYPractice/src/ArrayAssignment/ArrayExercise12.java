
package ArrayAssignment;
import java.util.Scanner;

public class ArrayExercise12 {
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

    int sum = 0;
    for(int i :intArr){
        sum += i;
    }

    System.out.println("Sum of elements in Array is :"+sum);
    
}
}
