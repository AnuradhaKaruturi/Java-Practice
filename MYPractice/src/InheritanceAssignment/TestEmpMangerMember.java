package InheritanceAssignment;
class Member{

   String Name;
   int  Age;
   String  Phonenumber;
   String  Address;
   double  Salary;

  void printSalary() {
      System.out.println("Salary is "+Salary);
      System.out.println("Name :"+Name);
      System.out.println("Age :"+Age);
      System.out.println("Phone Number :"+Phonenumber);
      System.out.println("Address :"+Address);
  }  

}

class  Employees extends Member{

    String specialization;

  }

class Manager extends Member{

    String department;

}

public class TestEmpMangerMember {
    public static void main(String[] args) {
     Employees emp = new Employees();
     Manager man = new Manager();   
     emp.Name = "John";
     emp.Age = 20;
     emp.Address = "Texas";
     emp.Phonenumber = "5686865984";
     emp.Salary=1000000;
     emp.specialization="DataAnalyst";
     emp.printSalary();

     man.Name = "Asiaran";
     man.Age = 28;
     man.Address = "Dallas";
     man.Phonenumber = "456784367";
     man.Salary=1050000;
     man.department="HR";
     man.printSalary();
    }
    
}
