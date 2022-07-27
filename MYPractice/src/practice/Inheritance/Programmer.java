package practice.Inheritance;

public class Programmer extends Employee {
  
    String language;
    Programmer(){
        this(10,20);
        System.out.println("Default Constructor in Programmer");
        System.out.println("--------");
    }
    Programmer(int a ,int b){
        super();
        System.out.println("values of a and b in programmer is"+a+" "+b);
    }
    final void display(){
        System.out.println("final Display method in Programmer ");
    }
    public void printData(){
       super.printData();
       System.out.println("language: " + language);
    }
    /* we cannot reduce the visibility of method in child class but we can increase its visibility
    ((private) static void StaticDisplay(){
        System.out.println("Static display in emp");
    }*/
    public static void Data(){
        System.out.println("Static method in programmer");
    }
 }