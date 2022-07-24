package Abstraction;
abstract class OuterAbsClass{
    abstract void outerAbsClassMethod();
    abstract class innerAbsClass{
          abstract void  innerAbsClassMethod();
    }
}

public class NewAbstractOverview extends OuterAbsClass {

    void outerAbsClassMethod() {
        System.out.println("immplementing outer abstract class inside newAbsClassMethod");
    }

    class innerNewAbstractOverview extends innerAbsClass{

        void innerAbsClassMethod() {
            System.out.println("immplementing inner abstract class inside innerAbsClassMethod");
        }
        
    }

    public static void main(String[] args) {
        
        NewAbstractOverview newObj = new NewAbstractOverview();
        newObj.outerAbsClassMethod();
        NewAbstractOverview.innerNewAbstractOverview obj = newObj.new innerNewAbstractOverview();
        obj.innerAbsClassMethod();
    }
    
}
