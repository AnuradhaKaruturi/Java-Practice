package Abstraction;
//Multi-Level Inheritance  abstract-->abstract --->non-abstract
 abstract class ParentAbstractClass    //parent  abstract class
 {  

    abstract void parentDisplay();  //abstract method
    abstract int sum();        // abstract method with int return type
    abstract String Name();
    
    static void staticParentMethod(){     //static method in abstract class
        System.out.println("static method in ParentAbstraction class");
    }

    final void finalParentMethod(){      // final method in abstract class
        System.out.println("final method in ParentAbstraction class");
    }

    void Display(){               //instance method in abstract class
        System.out.println("instance method in ParentAbstraction class");
    }

}
  
 abstract class AbstractChildClass extends ParentAbstractClass{ //AbstractChildclass
    void parentDisplay(){         //implementation of abstract method of ParentAbstract class in AbstractchildClass
        System.out.println("Implementation of parentDisplay method of ParentAbstraction class in AbstractChildClass");
    }

    int sum(){
        int a = 50;
        int b = 50;
        return a+b;
    }

}

class ChildOfAbstractChildclass extends AbstractChildClass{

    String Name(){
        String name = "Anu";
        return name;
    }

}
public class AbstractionDemoTest {

    public static void main(String[] args) {
        ChildOfAbstractChildclass childObj = new ChildOfAbstractChildclass();
        System.out.println(childObj.Name());
        System.out.println(childObj.sum());
        childObj.parentDisplay();
        childObj.Display();
        ParentAbstractClass.staticParentMethod();
        childObj.finalParentMethod();
        
    }
    
}