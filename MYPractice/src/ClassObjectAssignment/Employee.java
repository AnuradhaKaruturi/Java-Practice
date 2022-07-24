package ClassObjectAssignment;
import java.util.Scanner;
public class Employee {
    String name;
    int year;
    String address;
    void getData(Scanner sc){
        System.out.println("Enter Employees Name :");
        this.name = sc.next();
        System.out.println("Enter Joining Year :");
        this.year = sc.nextInt();
        System.out.println("Enter Employees Address :");
        this.address = sc.next();
    }
    void displayEmp(){
       
        System.out.println(name+"          "+year+"     "+address);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();
        emp1.getData(sc);
        Employee emp2 = new Employee();
        emp2.getData(sc);
        Employee emp3 = new Employee();
        emp3.getData(sc);
        System.out.println("Name          Joining Year     Address");
        emp1.displayEmp();
        emp2.displayEmp();
        emp3.displayEmp();
        sc.close();
    }
}

