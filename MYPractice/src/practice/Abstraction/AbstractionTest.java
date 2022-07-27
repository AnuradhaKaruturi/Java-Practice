package practice.Abstraction;
//abstract--->non abstract class 
 abstract class ParentAbstractClass2{  //parent  abstract class

    abstract void parentDisplay();  //abstract method
    abstract int sum();        // abstract method with int return type
    abstract String name();
    
    static void staticParentMethod(){     //static method in abstract class
        System.out.println("static method in ParentAbstraction class");
    }

    final void finalParentMethod(){      // final method in abstract class
        System.out.println("final method in ParentAbstraction class");
    }

    void display(){               //instance method in abstract class
        System.out.println("instance method in ParentAbstraction class");
    }

}
class NonAbstractChildClass2 extends ParentAbstractClass2{

    void parentDisplay(){
        System.out.println("Implementation of parentDisplay method of ParentAbstraction class in NonAbstractChildClass");
    }

    int sum(){
        int a = 10;
        int b = 20;
        return a+b;
    }

    String name(){
        return "ANU.K";
    }

}
public class AbstractionTest {
    public static void main(String[] args) {
        NonAbstractChildClass2 nonObj = new NonAbstractChildClass2();
        nonObj.display();
        System.out.println(nonObj.name());
        System.out.println(nonObj.sum());
        nonObj.finalParentMethod();
        
    }
}

