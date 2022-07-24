package ExceptionHandlingAssignment;
public class ExceptionProgram17 {
    int num1,num2;
    public ExceptionProgram17(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void main(String[] args) {
        Class obj = ExceptionProgram17.class;
        try {
            obj.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    
}
