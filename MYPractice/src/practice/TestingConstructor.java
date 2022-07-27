package practice;
public class TestingConstructor {  //class name with main method
    String name;
    int id;
    int a = 5,b = 5,c;
    static String clg; 
    //intialization block
    {
        name ="Anu";
        id = 123;
    }
    //static initialization block
    static{
        clg = "TF";
    }
    //default constructor
    TestingConstructor(){
      System.out.println("it is a default constructor");
    }
    //constructor with two parameters
    TestingConstructor(int a ,int b){
        this(2,4,8); //calling parameterized constructor from a constructor
        System.out.println("two parameters constructor with values a and b: "+a + " "+b);
        
    }
    TestingConstructor(int a ,int b,int c){
        this(); //calling default constructor
        this.a = a; //assigning values to instance variables 
        this.b = b;
        this.c = c;
        System.out.println("three parameters constructor");
        System.out.println(a+b+c);
    }
    //constructor with two diff type of parameters
    TestingConstructor(int id , String name){
        this(3,6);//calling parameterized constructor from a constructor
       System.out.println("ID is "+id+ " "+"Name is :"+name); 
    }
    //instance method
    void dispalyConstructor(){
        System.out.println("this is displayConstructor fun in testconstructor class");
    }
    public static void main(String[] args) {
        int num = 25;
        TestingConstructor obj = new TestingConstructor();//invoking constructors
        TestingConstructor obj1 = new TestingConstructor(10,20);
        TestingConstructor obj2 = new TestingConstructor(10,"Anu");
        new TestingConstructor(10,20,30);//calling constructor
        System.out.println(num + " "+TestingConstructor.clg);//accessing static variable
        obj.dispalyConstructor();   //accessing instance method
        AddNum addnum = new AddNum();  //creating obj for another class in same file
        addnum.display(); //calling display method in AddNum class
        obj1.dispalyConstructor();  //accessing instance method with different obj
        LargestOfThreeTernary ltt = new LargestOfThreeTernary();//creating obj for another class in different file
        System.out.println(ltt.output); //accessing instance method of LargestOfThreeTernary file from this file
    }
}
//Another class AddNum without main 
    class AddNum{
        int sum = 20;
        void display(){
         System.out.println("This is addClass and sum is :"+sum);
        }

    }
    
