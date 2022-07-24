package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {
      
        //using Stream.of
        System.out.println("Using Stream.of()");
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        stream.forEach(System.out::print);
         System.out.println();

         //using Arrays.Stream(arr)
         String arr[] = {"aa","bb","cc"};
         Stream<String> streamOfArrStrings = Arrays.stream(arr);

           //using Stream.of(arr)
         System.out.println("Using Stream.of(arr)");
        Stream<Integer> stream1 = Stream.of(new Integer[]{10,20,30,40,50});
        stream1.forEach(x->System.out.print(x+" "));

        // List.stream()
        System.out.println("\nUsing List.stream()");
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        Stream<String> liststream = list.stream();
        liststream.forEach(p -> System.out.print(p+" "));

        //Stream.generate() or Stream.iterate()

        System.out.println("\nUsing Stream.generate(supplier)");
        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100)).limit(10);
        randomNumbers.forEach(System.out::println);
        System.out.println();
       
        //using iterate
        Stream<Integer> streamOfOddNumbers = Stream.iterate(1, n -> n + 2).limit(10);
        streamOfOddNumbers.forEach(System.out::println);


        // Stream of String chars or tokens
        System.out.println("\nStream of characters");
        IntStream streams = "12345_abcdefg".chars();
        streams.forEach(p -> System.out.print(p+" "));
        System.out.println();
       Stream<String> streamc = Stream.of("A$B$C$D$E$F".split("\\$"));
       streamc.forEach(p -> System.out.print(p+" "));
      System.out.println();

       List<String> techlist = Arrays.asList("java","javascript", "dotnet", "python"); //creating a list
       Stream<String> streamofStrings = techlist.stream(); // creating a sequential stream (used most of the time)
      streamofStrings.forEach(System.out::println);
      System.out.println();
       Stream<String> parallelstreamofStrings = techlist.parallelStream(); // creating a parallel stream
       parallelstreamofStrings.forEach(System.out::println);


    }
    
}
