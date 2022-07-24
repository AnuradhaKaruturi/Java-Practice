package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsDemo {

    public static void main(String[] args) {

        List<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee(1, "Emily ", 4000.0));
        emplist.add(new Employee(2, "John ", 8000.0));
        emplist.add(new Employee(3, "Amina ", 3500.0));
        emplist.add(new Employee(4, "Aryana ", 4000.0));
        emplist.add(new Employee(5, "Ester ", 5000.0));
        emplist.add(new Employee(6, "Justin ", 7000.0));
        emplist.add(new Employee(7, "Dolly ", 4800.0));
        emplist.add(new Employee(8, "Peter ", 5200.0));
        emplist.add(new Employee(9, "William ", 6500.0));
        emplist.add(new Employee(10, "Lilly ", 3000.0));
        emplist.add(new Employee(11, "George ", 3900.0));
        emplist.add(new Employee(12, "Kate ", 6000.0));
        emplist.add(new Employee(13, "Jasper", 4000.0));
        emplist.add(new Employee(14, "Ester ", 6200.0));
        emplist.add(new Employee(15, "Jasper", 4000.0));
    

    //using map(),filter(),distinct() and forEach()
    System.out.println("Employees strating with J :");
    emplist.stream().map(Employee::getName).filter((e) -> e.startsWith("J")).distinct().forEach(System.out::println);

    //using skip() and limit
    Stream<Integer> num = Stream.iterate(1, n -> n + 1); 
    num.skip(10).limit(5).forEach(System.out::println);  

    //using unordered --Returns an equivalent stream that is unordered. May return itself, either because the stream was already unordered, or because the underlying stream state was modified to be unordered.
    long number = Arrays.asList(1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9).stream().unordered().filter(x->x/3==0).count();
    System.out.println(number);


    }
}
