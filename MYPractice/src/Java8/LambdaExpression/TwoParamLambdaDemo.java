package Java8.LambdaExpression;

@FunctionalInterface
interface FullName {

    public String Name(String Firstname ,String lastName);

}


public class TwoParamLambdaDemo {

    public static void main(String[] args) {
        FullName fullname = (x , y ) -> x +" "+ y;
       System.out.println(fullname.Name("Anuradha", "Karuturi"));
        
    }
    
}
