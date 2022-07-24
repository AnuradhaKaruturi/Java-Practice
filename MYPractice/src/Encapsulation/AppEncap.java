package practice.Encapsulation;
public class AppEncap {
    public static void main(String[] args) throws Exception {
        EncapsulationTest encapTestObj = new EncapsulationTest();
        EncapsulationTest.setSal(1000);
        encapTestObj.setAge(25);
        encapTestObj.setempName("Anuradha");
        encapTestObj.setempNum(100);
        System.out.println("Employee Name: " + encapTestObj.getempName());
         System.out.println("Employee Num: " + encapTestObj.getempNum());
         System.out.println("Employee Age: " + encapTestObj.getAge());
         System.out.println("Employee Str: " + encapTestObj.getStr());
         System.out.println("Employee Sal: " + EncapsulationTest.getSal());
    }
}
