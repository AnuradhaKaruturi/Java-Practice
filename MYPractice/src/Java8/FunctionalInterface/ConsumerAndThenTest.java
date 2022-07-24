package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThenTest {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, 3, "Anu"),
            new Student(2, 4, "Lucky"), 
            new Student(3, 3,"Vikky"),
            new Student(4, 4,"Shyam"));
    

    Consumer<Student> raise = stu -> { stu.gpa = stu.gpa * 1.1; };

    raiseStudentsGPA(students , System.out::println);
    System.out.println();
    raiseStudentsGPA(students , raise.andThen(System.out::println));
    
}

    private static void raiseStudentsGPA(List<Student> students, Consumer<Student> raise) {
        for (Student student : students) {
            raise.accept(student);
            
        }

    }
}



class Student {
    public int id;
    public double gpa;
    public String name;
  
    Student(int id, long g, String name) {
      this.id = id;
      this.gpa = g;
      this.name = name;
    }
  
    @Override
    public String toString() {
      return id + ">" + name + ": " + gpa;
    }
  }