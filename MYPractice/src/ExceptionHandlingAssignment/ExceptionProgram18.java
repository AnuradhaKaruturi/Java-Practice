package ExceptionHandlingAssignment;
import java.util.Scanner;

public class ExceptionProgram18 {

    public static void main(String args[]) throws IllegalArgumentException{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 10");
        int num = sc.nextInt();
        sc.close();
        if(num < 0 || num > 10){
            throw new IllegalArgumentException("Not a valid number.Out of given range");
        }
        else{
            System.out.println("Entered number is :"+num);
        }
    }
    

    
}
