package Exception;

import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionClass {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
      /* div(sc); without try-catch
      Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception.ExceptionClass.div(ExceptionClass.java:15)
        at Exception.ExceptionClass.main(ExceptionClass.java:8)    method  call stack
        */
       
      try {
          div(sc);
          throw new SQLException();
      } //catch (Exception e)
      catch (ArithmeticException | NullPointerException ae) {
          throw ae;  //Exception in thread "main" java.sql.SQLException at Exception.ExceptionClass.main(ExceptionClass.java:19)
        //  System.out.println("Exception Occured in Div() method");   Exception Occured in Div() method
      }
      finally{
          sc.close();
      }
    }
    
   private static void div(Scanner sc) {
    System.out.println("Enter a numbers");
     int num = sc.nextInt();
    // System.out.println(num/0);    Exception Occured in Div() method
    System.out.println(num);
    }
}
