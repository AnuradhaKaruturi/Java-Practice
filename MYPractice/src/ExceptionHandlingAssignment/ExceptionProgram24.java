package ExceptionHandlingAssignment;
public class ExceptionProgram24 {

    public static void main(String args[])  
    {  
       
        try {  
    
            try {  
    
                try {  
                    int arr[] = { 1, 2, 3, 4 };  
                    System.out.println(arr[10]);  
                }   
                catch (ArithmeticException e) {  
                    System.out.println(e);  
                    System.out.println("Inside of inner inner catch");
                }  
                finally{
                    System.out.println("Inside inner inner Finally");
                }
            }   
            catch (ArithmeticException e) {  
                System.out.println("Arithmetic exception in  inner catch");  
            }  

            finally{
                System.out.println("Inside inner finally");
            }
        }  
    
        catch (ArrayIndexOutOfBoundsException e4) {  
            System.out.print(e4);  
            System.out.println(" outer (main) try block");  
        }  
        catch (Exception e5) {  
            System.out.print("Exception");  
            System.out.println(" handled in main try-block");  
        }  
        finally{
            System.out.println("Outer Finally");
        }
    }  
    
}
