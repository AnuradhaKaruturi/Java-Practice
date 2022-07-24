package ExceptionHandlingAssignment;
import java.util.Scanner;

public class ExceptionProgram8 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionProgram8 obj = new ExceptionProgram8();
        System.out.println("Enter vlaues for a,b,c,d");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        try {
            obj.add(a);
        } catch (Exception e) {
           System.out.println(e.getLocalizedMessage());
        }

        try {
            obj.add(a, b);;
        } catch (Exception ae) {
           System.out.println(ae.getLocalizedMessage());
        }

        try {
            obj.add(a,b,c);
        } catch (Exception ee) {
           System.out.println(ee.getMessage());
        }

        try {
            obj.add(a,b,c,d);
        } catch (Exception aee) {
           aee.printStackTrace();
        }
    }

    void add(int a){
        System.out.println("Add 5 to A :"+(a+5));
    }

    void add(int a ,int b) throws Exception{
        System.out.println(a+b);
        System.out.println("Div by 0 :"+(a+b)/0);
    }

    void add(int a ,int b,int c) throws Exception{
        System.out.println(a+b+c);
        System.out.println("Div by 0 :"+(a+b)/0);  
    }

    void add(int a ,int b,int c,int d) throws Exception{
        System.out.println(a+b);
        System.out.println("Div by 0 :"+(a+b+c+d)/0);  
    }
}

