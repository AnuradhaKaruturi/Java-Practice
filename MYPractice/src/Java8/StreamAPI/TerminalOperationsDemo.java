package Java8.StreamAPI;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsDemo {

    public static void main(String[] args) {
        
        List<String> strList = Arrays.asList("anu", "", "vikram", "", "lucy", "robert","peter" ,"","susan" ,"williamson" ,"andrea"); 
        System.out.println(strList);
        System.out.println("List size : " + strList.size());
        
        //count
        long count = strList.stream() .filter(x -> x.isEmpty()) .count();
        System.out.println("Count of empty elements : "+ count);
        long num = strList.stream() .filter(x -> x.length()> 4) .count();
        System.out.println("Count of  elements  length more than 4: "+ count);
        long startwithA  = strList.stream().filter(x->x.startsWith("A")).count();
        System.out.println("Count of names strting with A : " +startwithA);

        // collect & ForEach 
        List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::println);
        
        //min() ,max() ,sum() , average()
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics primestream = primes.stream().mapToInt((x) -> x).summaryStatistics();
          System.out.println("Highest prime number in List : " + primestream.getMax());
          System.out.println("Lowest prime number in List : " + primestream.getMin());
          System.out.println("Sum of all prime numbers : " + primestream.getSum()); 
          System.out.println("Average of all prime numbers : " + primestream.getAverage()); 


          Stream<Integer> numb = Arrays.asList(1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9).stream();

          //stream toArray
           Object[] numArr = numb.toArray();
           System.out.println("NumberArray length " + numArr.length);

           Stream<Integer> numbers = Arrays.asList(1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9).stream();
           //count
           Long countnum = numbers.count();

           //reduce

           Optional<Integer> sum = Stream.of(1,2,3,4,5,6,7,8,9).limit(5).reduce((value1, value2) -> value1 + value2);
           System.out.println("sum of first 5 numbers using reduce opration : " + sum.get());

           //forEach
           System.out.println("ForEach Method");
           Stream.of(1,2,3,4,5,6,7,8,9).filter(x->x % 2 == 0).forEach(System.out::print);
           System.out.println();
           Stream.of(1,2,3,4,5,6,7,8,9).filter(x->x % 2 != 0).forEachOrdered(System.out::print);
           System.out.println();

           //min
           Integer min = Stream.of(1,2,3,4,5,6,7,8,9).min((x,y)->x.compareTo(y)).get();
           System.out.println("Min value : " + min);

           //min
           Integer max = Stream.of(1,2,3,4,5,6,7,8,9).max((x,y)->x.compareTo(y)).get();
           System.out.println("Max value : " + max);

           // Stream anyMatch() Method :This method checks the predicate condition. If any value in the stream matches to the given predicate then it returns true else false.
           boolean isAnymatchGreaterthan4 = Stream.of(3, 4, 5,6,7).parallel().anyMatch(value -> value > 4);
           boolean isAnymatchLessthan3 = Stream.of(3, 4, 5,6,7).parallel().anyMatch(value -> value < 3);
           System.out.println("anymatch value greaterthan 4: " + isAnymatchGreaterthan4);
           System.out.println("anymatch value Lessthan 3: " + isAnymatchLessthan3);


           //Stream allMatch() :This method also takes a predicate as an argument. Predicate holds a condition. If all values of stream match to the given predicate then it returns true else false.
           boolean isAllmatch =  Stream.of(2,4,8,12).parallel().allMatch(x->x%2 == 0);
           System.out.println("allmatch value : " + isAllmatch);

           //Stream noneMatch() :This takes a predicate as an argument. If all of the stream elements do not match the predicate condition then it returns true else false.

           boolean isnonematch =  Stream.of(2,4,8,12).parallel().noneMatch(x->x%2 != 0);
           System.out.println("allmatch value : " + isnonematch);

           //Stream findAny() :This will be getting the value randomly from the stream. That's why the method is named findAny if any value present in the stream.
           //The value will be returned as an Optional object. If the stream is empty then it returns empty Optional object.

           Optional<Integer> findAnyOpt =  Stream.of(1,2,3,4,5,6,7,8,9).findAny();
           System.out.println("Find any number : " + findAnyOpt.get());

           Optional<Integer> findAnyeven =  Stream.of(1,2,3,4,5,6,7,8,9).filter(x->x%2 == 0).findAny();
           System.out.println("Find any even  number : " + findAnyeven.get());

           Optional<Integer> findAnyOdd =  Stream.of(1,2,3,4,5,6,7,8,9).filter(x->x%2 != 0).findAny();
           System.out.println("Find any odd number : " + findAnyOdd.get());
           

           //findFirst
           Optional<Integer> findFirstNum =  Stream.of(1,2,3,4,5,6,7,8,9).findFirst();
           System.out.println("Find First number : " + findFirstNum.get());

           Optional<Integer> findFirsteven =  Stream.of(1,2,3,4,5,6,7,8,9).filter(x->x%2 == 0).findFirst();
           System.out.println("Find First even  number : " + findFirsteven.get());

           Optional<Integer> findFirstOdd =  Stream.of(1,2,3,4,5,6,7,8,9).filter(x->x%2 != 0).findFirst();
           System.out.println("Find First odd number : " + findFirstOdd.get());



           //Collect method is used to collect the output of the Stream into List or Set or to perform 
           //groupingby and partioningby operations on the stream.

           List<Integer> intList =Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.toList());
           System.out.println("List : "+ intList);
           Set<Integer> intSet = Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.toSet());
           System.out.println("Set : "+ intSet);
           Long numcount = Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.counting());
           System.out.println("Elements Count : "+ numcount);


        










    }
    
}
