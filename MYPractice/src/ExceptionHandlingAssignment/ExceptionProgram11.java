package ExceptionHandlingAssignment;
public class ExceptionProgram11 {
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10,12};

        try {
            System.out.println("Element in array at index 2 is :"+arr[1]);
            System.out.println("Element in array at index 6 is :"+arr[10]);
        }  catch(ArrayIndexOutOfBoundsException ar){
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
