package ExceptionHandlingAssignment;
import java.util.Scanner;

public class ExceptionProgram6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int arr[] = {2,4,6,8,10};
        int sum;
        try {
            try {
                String str = null;
                System.out.println(str.length()); 
            } catch (Exception e) {
                System.out.println(e); 
            }
            sum = num1/num2;
            System.out.println("Sum is :" +sum);
            System.out.println("Element in array at index 2 is :"+arr[1]);
            System.out.println("Element in array at index 6 is :"+arr[5]);
           
            
        } catch (ArithmeticException ae) {
            System.out.println(ae);  
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Array length is :"+arr.length);
        
        
        sc.close();
    }
}
