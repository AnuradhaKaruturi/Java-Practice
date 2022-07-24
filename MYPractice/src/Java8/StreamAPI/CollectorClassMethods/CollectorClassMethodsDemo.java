package Java8.StreamAPI.CollectorClassMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Java8.StreamAPI.Employee;

public class CollectorClassMethodsDemo {

    public static void main(String[] args) {
        
        List<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee(201, "Emily ","Service", 4000.0));
        emplist.add(new Employee(502, "John ", "HR" ,8000.0));
        emplist.add(new Employee(103, "Amina ", "Production" ,3500.0));
        emplist.add(new Employee(204, "Aryana ","Service", 4000.0));
        emplist.add(new Employee(403, "Ester ", "UI" , 5000.0));
        emplist.add(new Employee(506, "Justin ", "HR" , 7000.0));
        emplist.add(new Employee(304, "Dolly ","DB" , 4800.0));
        emplist.add(new Employee(208, "Peter ","Service", 5200.0));
        emplist.add(new Employee(409, "William ","UI" , 6500.0));
        emplist.add(new Employee(101, "Lilly ", "Production" ,3000.0));
        emplist.add(new Employee(202, "George ","Service", 3900.0));
        emplist.add(new Employee(302, "Kate ", "DB" ,6000.0));
        emplist.add(new Employee(404, "John ", "UI" ,4700.0));
        emplist.add(new Employee(102, "Andrew ", "Production" ,6300.0));

        emplist.forEach(x->System.out.println(x));

        //map() & collect()
        //names into list
        System.out.println("List of Names of all Employess");
        List<String> list = emplist.stream().map(Employee::getName).collect(Collectors.toList());
        list.forEach(System.out::println);

        //names into a TreeSet
        System.out.println("Set of Names of all Employess");
        Set<String> set = emplist.stream().map(Employee::getName).collect(Collectors.toCollection(TreeSet::new));
        set.forEach(System.out::println);

        // Convert elements to strings and concatenate them, separated by commas
        //joining()
        String joined = list.stream().map(Object::toString).collect(Collectors.joining(" , "));
        System.out.println("Names of all employess joined : " + joined);

        String joinedstr = list.stream().map(Object::toString).collect(Collectors.joining("//", "[", "]"));
        System.out.println("Names of all employess joined with prefix and suffix : " + joinedstr);

         // Compute sum of salaries of employee
        Double total = emplist.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Sum of Salaries of all employees : "+ total);

        //averaging
        Double averageDouble = emplist.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average of Salaries of all employees : "+ averageDouble);

        //counting
       Long no_of_employees = emplist.stream().collect(Collectors.counting());
       System.out.println("Total number of Employees : "+no_of_employees);  

        //dept list
        System.out.println("List bydept");
        List<String> list1 =  emplist.stream().map(Employee::getDept).distinct().collect(Collectors.toList());
        list1.forEach(System.out::println);
        long no_of_dept = list1.size();
        System.out.println("Number of departments in Company : "+no_of_dept); 

        // Group employees by department
        System.out.println("Group elements by Department :");
        Map<String, List<Employee>> byDept = emplist.stream().collect(Collectors.groupingBy(Employee::getDept));
        byDept.forEach((k,v)->System.out.println("Dept : " +  k  + " --- " +
         (v).stream().map(e->e.getName()).collect(Collectors.joining(" , "))));



    }
    
}
