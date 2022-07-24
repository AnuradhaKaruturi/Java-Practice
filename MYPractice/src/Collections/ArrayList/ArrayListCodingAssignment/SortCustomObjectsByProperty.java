package Collections.ArrayList.ArrayListCodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortCustomObjectsByProperty {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Varun", 27, 2));
        list.add(new Employee("Anil", 32, 15));
        list.add(new Employee("Ram", 38, 13));
        list.add(new Employee("Shreya", 25, 3));
        list.add(new Employee("Chetan", 35, 18));
        list.add(new Employee("Siva", 30, 10));

        System.out.println("Sorting based on Name");
        Collections.sort(list, new NameSort());
       for(Employee i : list){
           System.out.println(i);  
       }
        System.out.println();
        System.out.println("Sorting based on Age");
        Collections.sort(list, new AgeSort());
        for(Employee i : list){
            System.out.println(i);  
        }
        System.out.println();
        System.out.println("Sorting based on Experience");
        Collections.sort(list, new ExperienceSort());
        for(Employee i : list){
            System.out.println(i);  
        }

        
    }
    
}

class Employee{

    private String name;
    private int age;
    private int yearsOfExperience;
    
    public Employee(String name, int age, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    @Override
    public String toString() {
        return "Employee [age=" + age + ", name=" + name + ", yearsOfExperience=" + yearsOfExperience + "]";
    }
    
}

class AgeSort implements Comparator<Employee>{

   
    public int compare(Employee emp1, Employee emp2) {
        if(emp1.getAge() > emp2.getAge())
        return 1;
        else if(emp1.getAge() < emp2.getAge())
        return -1;
        else
        return 0;
    }
    
}

class ExperienceSort implements Comparator<Employee>{

   
    public int compare(Employee emp1, Employee emp2) {
        if(emp1.getYearsOfExperience() > emp2.getYearsOfExperience())
        return 1;
        else if(emp1.getYearsOfExperience() < emp2.getYearsOfExperience())
        return -1;
        else
        return 0;

    }
} 

class NameSort implements Comparator<Employee>{

    public int compare(Employee emp1, Employee emp2) {
        
        return emp1.getName().compareTo(emp2.getName());
        
    }
    
}