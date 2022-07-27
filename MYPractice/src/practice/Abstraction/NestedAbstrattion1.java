package practice.Abstraction;

// normal class -->(abstract class,static class,inner class)
class InnerAbstractTopClassExample{  //Top Class

    private int age = 25;
    private int id = 111;

    abstract class Example{    //abstract inner class
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        abstract void Info();    //abstract method
        abstract int Sum();

        void exmpleDisplay(){
            System.out.println("Age is :"+age+"  Id is :"+id);
        }
             abstract class AbstractInnerClassInsideAbstractClass extends Example{
                   void Info() {
                       System.out.println("Inside AbstractInnerClassInsideAbstractClass");
                    }

               }
            class InnerClassInsideAbstractClass extends AbstractInnerClassInsideAbstractClass{

                    void Info() {
                   System.out.println("Inside InnerClassInsideAbstractClass");  
                    }

                  int Sum() {
                return 100;
                       }
          
        }

    }

    static class StatExample{    // nested class(static)

        static void statDisplay(){
            System.out.println("Display method of Static nested class");
        }

    }

    class ExampleChild extends Example{   //(inner class)inherited class of abstract class

        void Info(){
             System.out.println("Name :"+getName());
        }
        int Sum() {
            return 500;
        }

    }
    
}

public class NestedAbstrattion1{
    public static void main(String[] args) {
        InnerAbstractTopClassExample Obj = new InnerAbstractTopClassExample();
        InnerAbstractTopClassExample.ExampleChild exObj = Obj.new ExampleChild();
        InnerAbstractTopClassExample.StatExample.statDisplay();
        exObj.setName("Anu");
        exObj.Info();
        System.out.println(""+exObj.Sum());
        exObj.exmpleDisplay();
        
    }

}

