package practice.Inheritance;

public class DatabaseProfessional extends Employee {
  
    String databaseTool;
    /*
    The call to super() must be the first line of the derived class constructor
If explicit call to parent constructor not made, the subclass' constructor will automatically invoke super(). (the default constructor of the base class, if there is one)
Can also use super to invoke a method from the parent class (from inside the derived class). */
    DatabaseProfessional(){
       System.out.println("Default Constuctor in DatabaseProfessional");
       System.out.println("--------");
    }
    public void printData(){
       super.printData();
       System.out.println("Database Tool: " + databaseTool);
    }
 }
