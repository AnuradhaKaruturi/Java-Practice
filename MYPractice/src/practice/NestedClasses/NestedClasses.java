package practice.NestedClasses;
public class NestedClasses {
    int id;
    String name;
    static int num ;
    static int outerX = 10;
    private int outer_private = 30;
    int outerY = 20;
    void display(){
       // System.out.println(b);  cannot access inner class members
       // i.e the enclosing class does not have access to the members of the nested class.
        System.out.println("Inside  display method of outermost class");
    }
    static  class InnerStaticClass{
            int b = 20;
            static String address = "India";
                 void displayInnerStatic(){
                     System.out.println(num); //can access outerclass members
                     //i.e A nested class has access to the members, including private members,
                     // of the class in which it is nested.
                       System.out.println("display method in inner class");
                   }
                 static void displayInnerclass(){
                        System.out.println("display static method in inner class");
                }
             public static void main(String[] args) {
                 InnerStaticClass obj2 = new InnerStaticClass();
                System.out.println(outerX); //static nested can access only static members of outer class
              //  System.out.println(obj1.id); cannot access the instance members of outer class
                 displayInnerclass();
                 obj2.displayInnerStatic();  
             }
            }
 //As a member of its enclosing class, a nested class can be declared private,
 // public, protected, or package private(default).

       private class InnerClass {
          // Static int percentage;
           //Inside normal/regular inner class, static members can’t be declared.
            void displayNonStatic(){
            System.out.println("outerX = " + outerX);
            System.out.println("outer_y = " + outerY);//both static and non static data of upper class can be accesed
            System.out.println("outer_private = " + outer_private);
         
        }
        //As main() method can’t be declared,
        // regular inner class can’t be invoked directly from the command prompt.
       // public static void main(String[] args) {
        //    InnerClass inrobj = obj1.new InnerClass();}
        
    }
    public static void main(String[] args) {
        NestedClasses obj1 = new NestedClasses();
        NestedClasses.InnerStaticClass obj = new InnerStaticClass();
        InnerClass obj2 = obj1.new InnerClass();
        obj2.displayNonStatic();
        int a = 10;
        obj1.display();
        obj.displayInnerStatic();
        NestedClasses.num = 50;

    }
}
