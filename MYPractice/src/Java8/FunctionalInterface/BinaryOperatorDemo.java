package Java8.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

    public static void main(String[] args) {
         // BiFunction
         BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;

         Integer result = func.apply(2, 3);
 
         System.out.println(result); // 5
 
         // BinaryOperator
         BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
 
         Integer result2 = func2.apply(2, 3);
 
         System.out.println(result2); // 5
    }
    
}
