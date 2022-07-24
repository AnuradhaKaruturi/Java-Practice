package Collections.TreeSet;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorWithUserDefObj {

    public static void main(String[] args) {
    
    TreeSet<Employee> set = new TreeSet<>(new NameSort());
    set.add(new Employee("Varun", 27, 2));
    set.add(new Employee("Anil", 32, 15));
    set.add(new Employee("Ram", 38, 13));
    set.add(new Employee("Shreya", 25, 3));
    set.add(new Employee("Chetan", 35, 18));
    set.add(new Employee("Siva", 30, 10));
   
    for(Employee i : set){
        System.out.println(i);  
    }

    System.out.println();
    TreeSet<Employee> set2 = new TreeSet<>(new NameDescSort());
    set2.add(new Employee("Varun", 27, 2));
    set2.add(new Employee("Anil", 32, 15));
    set2.add(new Employee("Ram", 38, 13));
    set2.add(new Employee("Shreya", 25, 3));
    set2.add(new Employee("Chetan", 35, 18));
    set2.add(new Employee("Siva", 30, 10));

    for(Employee i : set2){
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

class NameDescSort implements Comparator<Employee>{

    public int compare(Employee emp1, Employee emp2) {
        
        return emp2.getName().compareTo(emp1.getName());
        
    }
    
}