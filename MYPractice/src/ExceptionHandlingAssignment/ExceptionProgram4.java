package ExceptionHandlingAssignment;
import java.util.Scanner;

public class ExceptionProgram4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter two numbers for Division");
     int n1 = sc.nextInt();
     int n2 = sc.nextInt();
     division(n1,n2);  
     sc.close();
    }

    public static void division(int n1,int n2) throws ArithmeticException{
        if(n2 < 0) {
            throw new ArithmeticException("cannot divide by Zero");
        }
        else{
            System.out.println("reminder is :"+n1%n2);
        }
    }
    
    
}
