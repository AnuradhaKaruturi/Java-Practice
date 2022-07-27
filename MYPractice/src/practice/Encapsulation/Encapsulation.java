package practice.Encapsulation;

 class EncapsulationTest {
     private String  sum;
     static int Sal;
     protected int age;
     private int empNum;
     private String empName;
     final String str = "Anu";
     public String getStr() {
        return str;
    }

    int id;
    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public static int getSal() {
        return Sal;
    }

    public static void setSal(int sal) {
        Sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getempNum(){
        return empNum;
    }

    public String getempName(){
        return empName;
    }
     
    public void setempNum(int empNum){
       this.empNum = empNum;
    }

    public void setempName(String empName){
        this.empName = empName;
    }

}
 public class Encapsulation{
    public static void main(String[] args) {
        EncapsulationTest encapTestObj = new EncapsulationTest();
        encapTestObj.id = 100;
        System.out.println(encapTestObj.id);
     //   encapTestObj.empName;  can't access private member of other class 
     // to access them we need to create  getter and setter methods for the private members
          encapTestObj.setempName("Anu");
          encapTestObj.setempNum(32);
       
         System.out.println("Employee Name: " + encapTestObj.getempName());
         System.out.println("Employee Num: " + encapTestObj.getempNum());
        
    }
}

	