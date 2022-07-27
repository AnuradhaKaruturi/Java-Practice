package practice.Abstraction;

 // abstract -->final class
abstract class NormalAbstractClass{
    abstract void display();

    private int sum;
     
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    static void  staticdisplay(){
        System.out.println("Static display in normalAbstact class");
    }

    void nonStaticClassDisplay(){
        System.out.println("Non static method in normalAbstarct class");
    }
     
    final void finalMethod(){
        System.out.println("final method");
    }
}

final class finalClass extends NormalAbstractClass{


    void display() {
       System.out.println("Implementing display method of abstract class in final child class");
    }

    void displaySum(){
         System.out.println(getSum());
    }

    
}
public class AbstractionFinalTest {
    public static void main(String[] args) {
        finalClass finalObj = new finalClass();
        finalObj.display();
        finalObj.finalMethod();
        finalObj.nonStaticClassDisplay();
        finalClass.staticdisplay();
        finalObj.setSum(25);
    }

   
    
}
