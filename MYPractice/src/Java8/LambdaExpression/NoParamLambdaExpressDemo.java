package Java8.LambdaExpression;

@FunctionalInterface
interface Print {

    public void printable();

}

public class NoParamLambdaExpressDemo {

    public static void main(String[] args) {

        Print  data =  () ->System.out.println("Anu");
        data.printable();
    }
    
}
