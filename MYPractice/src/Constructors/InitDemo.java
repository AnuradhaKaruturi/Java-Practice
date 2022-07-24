package practice.Constructors;

public class InitDemo 
{
    //Initialization block
    // block to be executed before any constructor. 
    { 
    System.out.println("Inside init block"); 
    } 
//Default constructor 
    InitDemo() 
    { 
         System.out.println("Inside Default constructor"); 
    } 
// parameterized constructor with one argument. 
    InitDemo(int n) 
    { 
        System.out.println("Inside Parameterized constructor");
        System.out.println(n); 
    } 

public static void main(String[] args) 
{ 
// Object creation by calling no-argument constructor. 
new InitDemo(); 
// Object creation by calling one-argument constructor.
new InitDemo(10); 
} 
}

