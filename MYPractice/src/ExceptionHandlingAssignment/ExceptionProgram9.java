package ExceptionHandlingAssignment;
import java.io.*;
public class ExceptionProgram9 {
    public static void main(String[] args) throws FileNotFoundException,ClassNotFoundException{
        try {
            FileInputStream file = new FileInputStream("/src/Anuradha/abc.txt");
            
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
          
        }
        try {
            Class xyz = Class.forName("abc");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not Found");
            
        }
           
    }
    
}
