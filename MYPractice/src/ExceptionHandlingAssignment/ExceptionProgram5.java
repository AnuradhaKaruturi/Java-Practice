package ExceptionHandlingAssignment;
import java.util.Scanner;

public class ExceptionProgram5 {
    public static void main(String[] args) throws ArithmeticException {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter two numbers for Division");
     int n1 = sc.nextInt();
     int n2 = sc.nextInt();
     sc.close();
     try {
        int c = n1 / n2;
        System.out.println("Division is :" + c);
        throw new Exception("Exception Occured");
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}