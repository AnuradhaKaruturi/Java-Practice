package practice.Constructors;

class StudentOverloading{  
    int id;  
    String name;  
    int age;
    
    StudentOverloading(int i,String n)           //creating a parameterized constructor  
{  
    id = i;  
    name = n;  

}  

     StudentOverloading(int i,String n,int a)           //creating a parameterized constructor  
{  
    id = i;  
    name = n;  
    age = a;
 }  

    void display()
{
System.out.println(id+" "+name+" "+age);
}   
    public static void main(String args[]){  
        StudentOverloading s1 = new StudentOverloading(111,"Karan");   //creating objects and passing values
        StudentOverloading s2 = new StudentOverloading(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   } 
 }  

