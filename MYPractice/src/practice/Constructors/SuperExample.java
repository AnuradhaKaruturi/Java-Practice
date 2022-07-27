package practice.Constructors;

class Parent 
{
    Parent() {
        System.out.println("Parent class default constructor");
        }
     Parent(int x) {
        System.out.println("Parent class one-argument constructor");
        }
 }


 class Child extends Parent 
 {
    Child() {
    //by default the default constructor of Parent class is invoked
       System.out.println("Child class default constructor");
    }
    Child(int x) {
       super(); // default constructor of Parent class is invoked
       System.out.println("Child class one-argument constructor");
    }
 }

 public class SuperExample {
    public static void main(String arg[]) {
     new Child();
     new Child(10);
    }
    }
    