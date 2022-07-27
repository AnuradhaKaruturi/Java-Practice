package practice;
class ParentClasses{
   
    {
        System.out.println("Parent Intilization Block");
    }
    static{
        System.out.println("Parent Static block");
    }
    ParentClasses(){
        System.out.println("Parent Constructor");
    }

}

class ChildClasses extends ParentClasses{
   
    {
        System.out.println(" Child Intilization Block");
    }
    static{
        System.out.println("Child Static block");
    }
    ChildClasses(){
        System.out.println("Child Constructor");
    }
    
}


public class staticIntilizationblocksConstructor {
    public static void main(String[] args) {
    new ChildClasses();
    }
    
}
