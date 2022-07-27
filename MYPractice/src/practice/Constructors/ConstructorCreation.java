package practice.Constructors;

public class ConstructorCreation {

   /* ConstructorCreation (){           //default constructor
        System.out.println("Constructor is created");
        }  

 /*   ConstructorCreation (){           //compile throws error if i don't define default constructor if i define only param constructor
        System.out.println("Constructor is created");
        }  
  */

    ConstructorCreation (int a ,int b){           //default constructor
            System.out.println("A value is : "+a+"\n"+"B value is : "+b);
            }
        public static void main(String args[]){  
    //    new ConstructorCreation (); //object creation & default constructor calling
        new ConstructorCreation (10,20); //object creation & parameterized constructor calling 
        }    
}



//default constructor that displays the default values
//Java compiler provides a default constructor by default.History 
class Student{  
    int id;  
    String name;  
    void display()
    {
    System.out.println(id+" "+name);
    }  
      
    public static void main(String args[])
    {  
    Student s1=new Student();  
    Student s2=new Student();  
    s1.display();  
    s2.display();  
    }  
    }
    