package practice.TypeCasting;

class Parent {
    public String name;

    void PrintData() {
        System.out.println("method of parent class");
    }
}

class Child extends Parent {
    public int age;

    void PrintData() {
        System.out.println("method of child class");
    }

    public void showMessage() {
    }
}

public class UpCastingExample {
    public static void main(String args[]) {

        Parent obj1 =  new Child();
        Parent obj2 =  new Child();
        obj1.PrintData();
        obj2.PrintData();
    }
}
