package AbstractionAssignment;

abstract class ParentClassAbst{
 abstract void message();
}

 class Subclass1 extends ParentClassAbst{
     void message(){
         System.out.println("This is first child class");
     }
 }

 class Subclass2 extends ParentClassAbst{
     void message(){
         System.out.println("This is second child class");
     }
 }

 public class AbstractionAssignment1{
     public static void main(String[] args) {
         Subclass1 subObj1 = new Subclass1();
         Subclass2 subObj2 = new Subclass2();
         subObj1.message();
         subObj2.message();
     }
 }

