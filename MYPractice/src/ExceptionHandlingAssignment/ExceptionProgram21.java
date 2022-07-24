package ExceptionHandlingAssignment;
import java.util.Scanner;

public class ExceptionProgram21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum;
        sc.close();
        try{
            sum = num1+num2;  
            System.out.println("Sum is :"+sum);
        }
        catch( ArithmeticException ae){
            System.out.println(ae);
        }
        catch( NumberFormatException ae){
            System.out.println(ae);
        }
        catch(Exception ae){
            System.out.println(ae);
        }

    }
    
}
