package InterfaceAssignment;
interface VariableType{
  //  int num;   (default it is final can't be blank)
   int num = 10;
   public  String name ="Tech";
   public int num2 = 20;
    static int sum = 30;
    final int finalVar = 100;
    public static final double PI = 3.14;
  //  private int number;  illegal modifier only public static final allowed
}


public class Exercise4 implements VariableType {

    public static void main(String[] args) {
     //   num = 15;   final variable can't be assigned
        System.out.println("num :"+num+"\n"+" num2 :"+num2+"\n"+"Sum :"+sum+"\n"+"Name :"+name);
        System.out.println("Final Variable :"+finalVar+"\n"+"Static final Variable :"+PI);
    }
    
}
