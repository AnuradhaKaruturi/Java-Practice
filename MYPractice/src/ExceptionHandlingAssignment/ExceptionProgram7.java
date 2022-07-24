package ExceptionHandlingAssignment;
public class ExceptionProgram7 {
    public static void main(String[] args) {

        chainedExceptionDemoo dem = new chainedExceptionDemoo();
        dem.method3();
    }
}

class chainedExceptionDemoo{

    void method1(){
        int data = 100/0;
        System.out.println(data);
       }
    void method2(){
        method1();
    }

    void method3(){
        try {
           method2();
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}


    
    