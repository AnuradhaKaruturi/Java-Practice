package ExceptionHandlingAssignment;
import java.util.Scanner;

public class ExceptionProgram10 {

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
            System.out.println(sum/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception ae){
            System.out.println(ae);
        }

    }
    
}

