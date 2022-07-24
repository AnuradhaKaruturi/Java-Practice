package Java8.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Prints {

    public void printable(String name);

}


public class SingleParamDemo {
    public static void main(String[] args) {

        Prints data = (name) -> System.out.println(name);
        data.printable("Anu");

        List<String> list=new ArrayList<String>();  
       list.add("sree");         
       list.add("hari");       
       list.add("varun");         
       list.add("devi");         
       list.add("sita");          
       list.forEach((names)->System.out.println(names) );     

    }
    
    
}
