package ExceptionHandlingAssignment;
public class ExceptionProgram15 {
    public static void main(String[] args) {
        
        try {
            int[] arr = new int[-10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } 
        catch(NegativeArraySizeException n){
           n.printStackTrace();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
