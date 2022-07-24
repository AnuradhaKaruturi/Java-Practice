package ExceptionHandlingAssignment;
import java.util.Scanner;
public class ExceptionProgram25 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int randNum;
        sc.close();
        try{
            if(num < 0){
                throw new ArithmeticException("not valid number");
            }
         }

        catch( ArithmeticException ae){
            System.out.println(ae);
        }
        finally{
            System.out.println("Inside of Finally Block");
            randNum =(int) Math.random()*10+2;
            System.out.println("System Generated Random Number is :"+randNum);
        }
    }
}