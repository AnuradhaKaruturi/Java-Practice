package Java8.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Anu", Arrays.asList("Java","Angularjs","SQL"), 3000.0));
        employees.add(new Employee("Sree", Arrays.asList("Ruby","Angularjs","Java"),4000.0));
        employees.add(new Employee("Venu", Arrays.asList("Spring","Java","SQL","Python"), 4500));
        employees.add(new Employee("Charan", Arrays.asList("Python","Ruby","SQL","ReactJs"),5000));

       //names of each employee
       System.out.println("names of each employee");
        employees.stream().map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);

       //names of each skill 
       System.out.println("names of each skill :");
       employees.stream().flatMap(s->s.getSkills().stream()).collect(Collectors.toSet()).forEach(System.out::println);

       //using sorted
       System.out.println("names of  employee in Sorted order");
       employees.stream().map(Employee::getName).sorted().collect(Collectors.toList()).forEach(System.out::println);
      
       //using sorted for reverse
       System.out.println("names of  employee in Sorted order");
       employees.stream().map(Employee::getName).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

       //using peek()
       System.out.println("Incremented Salaries ");
       employees.stream().map(Employee::getSalary).map(e->e * 10.0/100).peek(System.out::println).collect(Collectors.toList());
    }
    
}

