package InheritanceAssignment;
class ParentClass{
  
   public void PrintParent(){

       System.out.println("This is Parent class");
   }
}

class ChildClass extends ParentClass{

    public void PrintChild(){
        System.out.println("This is Child class");
    }

}

public class ParentChildClassTesting {
    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        ChildClass  childObj = new ChildClass();
        parentObj.PrintParent();
        childObj.PrintChild();
        childObj.PrintParent();
    }
}
