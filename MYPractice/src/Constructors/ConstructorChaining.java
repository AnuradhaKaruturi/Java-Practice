package practice.Constructors;

    class Example
     {
        //default constructor
        Example() {
        System.out.println("Inside Default");
        }
        //Parameterized constructor
        Example(int n) {
        //calling default constructor
        this();
        System.out.println("Inside Parameterized : "+n);
        }
        Example(int n, int m) {
            //calling default constructor
            this(5);
            System.out.println("Inside two  Parameterized : "+n+"  "+m);
            }
    }

     public class ConstructorChaining {
        public static void main(String arg[]) {
        //calling the parameterized constructor
        new Example(15);
        new Example(15 , 30);
        }
    }
        
