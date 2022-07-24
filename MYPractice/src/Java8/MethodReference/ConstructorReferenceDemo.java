package Java8.MethodReference;


    
interface One {
	public Employee getEmployee();
}

interface Two {
	public Employee getEmployee(String name, int age);
}

class Employee {
	String eName;
	int eAge;
	
	public Employee(){} 
	
	public Employee(String eName, int eAge) {
		this.eName = eName;
		this.eAge = eAge;
	}
	
	public void getInfo() {
        System.out.println(eName +"  "+ eAge);
		System.out.println("I am a method of class Employee");
	}
}

public class ConstructorReferenceDemo {

	public static void main(String[] args) {	
		
		//*** Using Lambda Expression ***//
		One o1 = () -> new Employee();
		o1.getEmployee().getInfo();
		Two t1 = (name,age) -> new Employee(name,age);
		t1.getEmployee("Anu", 26).getInfo();
		
		//*** Using Method Reference ***//
		One o2 = Employee::new;
		o2.getEmployee().getInfo();
		Two t2 = Employee::new;
		t2.getEmployee("Sri", 25).getInfo();
	}
}