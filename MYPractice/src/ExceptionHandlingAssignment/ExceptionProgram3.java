package ExceptionHandlingAssignment;

import java.util.Scanner;
public class ExceptionProgram3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age to check eligibility to vote");
        int num = sc.nextInt();
        sc.close();
        if(num < 18){
            throw new ArithmeticException("not eligible to vote");
        }
        else{
            throw new ArithmeticException(" Eligible to vote");
        }
        
    }
    
}
