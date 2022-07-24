package Java8.FunctionalInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {


        UnaryOperator<Integer> xor = a -> a ^ 1;
        UnaryOperator<Integer> and = a -> a & 1;
        Function<Integer, Integer> compose = xor.andThen(and);
        System.out.println(compose.apply(4));

        
        UnaryOperator<Integer> val = a -> a + 1;
        UnaryOperator<Integer> mul = a -> a * 2;
        Function<Integer, Integer> out = val.andThen(mul);
        System.out.println(out.apply(10));
        
    } 

    
}

