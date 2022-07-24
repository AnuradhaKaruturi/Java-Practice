package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("anu", "devi", "sriram", "vinaykumar" , "kiranrao" , "varshasri");
        System.out.println("Length of each String is :");
        Consumer<String> str = (String x) -> System.out.print(x+" ");
        Consumer<String> consumer = (String x) -> System.out.println(x.length());
        forAllStrings( list , str , consumer); 
    }

    private static void forAllStrings(List<String> list, Consumer<String> str, Consumer<String> consumer) {
        for (String s : list) {
            str.accept(s);
            consumer.accept(s);
        }
    }
    
}
