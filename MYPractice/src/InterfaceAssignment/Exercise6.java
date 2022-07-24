package InterfaceAssignment;
interface One{
    void One1();
    void One2();
}

interface Two{
    void Two1();
    void Two2();
}

interface Three{
    void Three1();
    void Three2();
}

interface Number extends One,Two,Three{

    void num1();
    void num2();
    default void Sum(){
        System.out.println("Sum of 10 and 20 is :"+30);
    }
    static void statMethod(){
        System.out.println("Static Method");
    }
}


public class Exercise6 implements Number {

    public void One1() {
      System.out.println("ONE1");     
    }

    public void One2() {
        System.out.println("ONE2");
        
    }

    public void Two1() {
        System.out.println("TWO1");
        
    }
    public void Two2() {
        System.out.println("TWO2");
        
    }
    public void Three1() {
        System.out.println("THREE1");
        
    }
    public void Three2() {
        System.out.println("THREE2");
        
    }
   public void num1() {
        System.out.println("NUM1");
        
    }
    public void num2() {
       System.out.println("NUM2");
        
    }
    public static void main(String[] args) {
        Exercise6 exObj = new Exercise6();
        exObj.One1();
        exObj.One1();
        exObj.Two1();
        exObj.Two2();
        exObj.Three1();
        exObj.Three2();
        exObj.num1();
        exObj.num2();
        exObj.Sum();
        Number.statMethod();
    }
    
}
