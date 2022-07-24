package Java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {  // an argument and returns boolean value.

    // identifying all odd numbers from a given set 
    public static void main(String[] args) {

        int array[] = { 10 ,-4 ,0 ,33 , 83, 91, 48 , -6, 12 ,500 , 437 , -55 , 15 , 22 , -40 , 29 , 42};

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        Predicate<Integer> oddNums = (num -> num % 2 != 0);
        Predicate<Integer> evenNums = (num -> num % 2 == 0);
        Predicate<Integer> positiveNums = (num -> num > 0);
        Predicate<Integer> negativeNums = (num -> num < 0);
        Predicate<Integer> positiveAndOdd = positiveNums.and(oddNums);
        Predicate<Integer> positiveOrOdd = positiveNums.or(oddNums);
        Predicate<Integer> negative = positiveNums.negate();

        System.out.println("Odd Numbers : " + filter(array, oddNums));
        
        System.out.println("Even Numbers : "+ filter(array, evenNums));
        
        System.out.println(" Positive Numbers : " + filter(array, positiveNums));
        
        System.out.println("Negative Numbers : "+  filter(array, negativeNums));
        
        System.out.println("Negative Numbers : " + filter(array, negative));
        
        System.out.println(" Positive or Odd : " + filter(array, positiveOrOdd));
        System.out.println("Positive and Odd : "+ filter(array,positiveAndOdd));
        
    }

    public static List<Integer> filter(int[] array, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : array) {
               if (predicate.test(i))
                     result.add(i);
        }
        return result;
 }
    
}
