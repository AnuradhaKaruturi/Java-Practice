package practice.Constructors;
public class ExampleClass {

    //Instance initializer block
    {
        System.out.println("Hello this is Instance initializer block");
    }

    //static block
    static
    {
       System.out.println("Hello this is a static block");
    }

    //constructor
    ExampleClass(){
       System.out.println("Hello this a constructor");
    }

    //static method
    public static void demo() {
       System.out.println("Hello this is an static method");
    }

    //instance method
    public void display(){
        System.out.println("Hello this is an instance method ");
    }
    public static void main(String args[]){
   ExampleClass ex =  new ExampleClass();
    ExampleClass.demo();
    ex.display();
    }
 }
 
