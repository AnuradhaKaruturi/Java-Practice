package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxingUnboxing {

    public static void main(String[] args) {

        //to convert primitive values to their wrapper equivalents.use boxed() method

        List<Integer> evenInt = IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        System.out.println(evenInt);
    
        //convert from the wrapper class stream to the primitive stream use mapToXXX method
        int sum = Arrays.asList(33,45,36,55).stream().mapToInt(i->i).sum();
        System.out.println("Sum  : " +sum);

        OptionalDouble avg = Arrays.asList(20.0, 35.6 ,40.3, 25.5).stream().mapToDouble(x->x).average();
        System.out.println("Average : "+avg);

    
    
    
    }
    
}
