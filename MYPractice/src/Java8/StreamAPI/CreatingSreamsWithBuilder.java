package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class CreatingSreamsWithBuilder {

    public static void main(String[] args) {

        Employee[] arrayOfEmps = {
            new Employee(1, "Emily ", 100000.0), 
            new Employee(2, "Vicktor", 200000.0), 
            new Employee(3, "Mike", 300000.0)
        };
        //using Stream.of
        Stream.of(arrayOfEmps);

        //using list
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        empList.stream();

        Stream<Employee> stream1  = Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);
        stream1.forEach(System.out::println);
        //using Builder
        Stream.Builder<Employee> streamEmpBuilder =   Stream.builder();
        streamEmpBuilder.accept(new Employee(100, "Anu", 250000.0));
        streamEmpBuilder.accept(new Employee(100, "Devi", 300000.0));
        streamEmpBuilder.accept(new Employee(100, "Dhivya", 350000.0));
        streamEmpBuilder.accept(new Employee(100, "Chandu", 400000.0));

        Stream<Employee> empStream = streamEmpBuilder.build();
        empStream.forEach(System.out::println);
    }
    
}


