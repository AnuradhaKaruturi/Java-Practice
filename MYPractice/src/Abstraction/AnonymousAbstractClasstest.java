package Abstraction;
//Multi-Level Inheritance  abstract-->abstract --->non-abstract
 abstract class ParentAbstractClass1    //parent  abstract class
 {  
    
    ParentAbstractClass1(){
        System.out.println("Parent class Constructor");
    }
    protected  abstract void parentDisplay();  //abstract method
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
  
 abstract class AbstractChildClass1 extends ParentAbstractClass1{ //AbstractChildclass
    
    protected void parentDisplay(){         //implementation of abstract method of ParentAbstract class in AbstractchildClass
        System.out.println("Implementation of parentDisplay method of ParentAbstraction class in AbstractChildClass");
    }
    String name(){
        String name = "Anu";
        return name;
    }

    int sum(){
        int a = 30;
        int b = 75;
        return a+b;
    }
  AbstractChildClass1(){
      System.out.println("In Abstract child class Constructor");
  }
}

class ChildOfAbstractChildclass1 extends AbstractChildClass1{

    int sum(){
        int a = 50;
        int b = 50;
        return a+b;
    } 

}
public class AnonymousAbstractClasstest {

    public static void main(String[] args) {
        ChildOfAbstractChildclass1 childObj = new ChildOfAbstractChildclass1();
        AbstractChildClass1 absObj = new AbstractChildClass1(){
            /* by the time i reach abstractchildclass if i don't complete the implementation of all my abstract methods
            then my anonymous class will throw error the fix is to impement the remaining abstract method in anonymous class
            but the instance will belongs only to anonymous class but not to abstract class */
        };
   absObj.parentDisplay();
   absObj.finalParentMethod();
    System.out.println(absObj.name());
    absObj.display();
      System.out.println(childObj.name());
       System.out.println(childObj.sum());
        childObj.parentDisplay();
        childObj.display();
        ParentAbstractClass1.staticParentMethod();
        childObj.finalParentMethod();
        childObj.sum();
    }
    
}
