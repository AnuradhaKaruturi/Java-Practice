package Abstraction;

abstract class OuterCLass{ // abstract outer class

    abstract void OuterClassMethod();

    abstract class InnerClass // abstract inner class
    {
        abstract void InnerClassMethod();
    }
}

public class overview extends OuterCLass{ // "Overview" class is extend with abstract outer class

    void OuterClassMethod(){  // provide implementation of abstract method of "outerclass"
        System.out.println("Abstract method of outer class");
    }


    public class OverviewInner extends InnerClass{ // Inner class of "Overview(which is extended by Outer class)" is extended by abstract Innerclass of outer class

        void InnerClassMethod() // Implementation of abstract method of innerclass
        {
            System.out.println("Abstract method of Inner class");
        }

    }

    public static void main(String[] args) 
    {
        overview ob1 = new overview();
        ob1.OuterClassMethod();
        overview.OverviewInner ob2 = ob1.new OverviewInner();
        ob2.InnerClassMethod();

    }  
}



