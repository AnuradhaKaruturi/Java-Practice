package ClassObjectAssignment;
public class Student2 {
    String name;
    int roll_no;
    int phn_no;
    String address;
    public static void main(String[] args) {
        Student2 obj1 = new Student2();
        Student2 obj2 = new Student2();
        obj1.name = "Sam";
        obj1.roll_no = 1;
        obj1.phn_no = 780123456;
        obj1.address = " xyz new york";
        obj2.name = "John";
        obj2.roll_no = 2;
        obj2.phn_no = 780908765;
        obj2.address = "abc new york";
        System.out.println(obj1.name+" "+obj1.roll_no+" "+obj1.phn_no+" "+obj1.address);
        System.out.println(obj2.name+" "+obj2.roll_no+" "+obj2.phn_no+" "+obj2.address);
    }
}
