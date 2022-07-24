package ExceptionHandlingAssignment;
public class ExceptionProgram12 {

    public static void main(String[] args) throws ClassNotFoundException{
        
        try {
            Class xyz = Class.forName("abc");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not Found");
            
        }catch(Exception e){
          System.out.println(e.getMessage());
        }
           
    }
    
}
