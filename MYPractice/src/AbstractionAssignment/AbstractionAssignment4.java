package AbstractionAssignment;
abstract class Abstractionparent{
    Abstractionparent(){
        System.out.println("This is a constructor of AbstractParent class");
    }

    abstract void a_method();

    void printNonAbstractMethod(){
        System.out.println("This is Normal Method od Abstract class");
    }  
}
class SubClassAbstractClass extends Abstractionparent{
    void a_method(){
      System.out.println("This is abstract method");
    }
}

public class AbstractionAssignment4 {
    public static void main(String[] args) {
        SubClassAbstractClass subobj = new SubClassAbstractClass();
        subobj.a_method();
        subobj.printNonAbstractMethod();
        
    }
}


/*This is a constructor of AbstractParent class
This is abstract method
This is Normal Method od Abstract class
*/