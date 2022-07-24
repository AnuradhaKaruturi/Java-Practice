package Collections.Iterator;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;
public class SpliteratorDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(150);
        list.add(200);
        list.add(250);
        list.add(300);
        list.add(350);

        Stream<Integer> str = list.stream();

        Spliterator<Integer> splitr = str.spliterator();
        System.out.println("Estimate size: "+ splitr.estimateSize());
       System.out.println("Exact size: "+ splitr.getExactSizeIfKnown());
       System.out.println("Characteristics : "+ splitr.characteristics());
       System.out.println("Boolean Result for has Characteristics : "+ splitr.hasCharacteristics(splitr.characteristics()));
       System.out.println("Elements of ArrayList :");
       splitr.forEachRemaining((num) -> System.out.println(num));


       Stream<Integer> str1 = list.stream();
  
        splitr = str1.spliterator();
        Spliterator<Integer> splitr2 = splitr.trySplit();
        Spliterator<Integer> splitr3 = splitr.trySplit();
        Spliterator<Integer> splitr4 = splitr.trySplit();
        Spliterator<Integer> splitr5 = splitr.trySplit();
        if (splitr5 != null ) {
            System.out.println("Output from splitr5: ");
            splitr5.forEachRemaining((n) -> System.out.println(n));
        } 
        if (splitr4 != null ) {
  
            System.out.println("Output from splitr4: ");
            splitr4.forEachRemaining((n) -> System.out.println(n));
        } 
        if (splitr3 != null ) {
  
            System.out.println("Output from splitr3: ");
            splitr3.forEachRemaining((n) -> System.out.println(n));
        } 

        if (splitr2 != null ) {
  
            System.out.println("Output from splitr2: ");
            splitr2.forEachRemaining((n) -> System.out.println(n));
        }
        // Now, use the splitr
        System.out.println("Output from splitr1: ");
        splitr.forEachRemaining((n) -> System.out.println(n));
    

    }
}