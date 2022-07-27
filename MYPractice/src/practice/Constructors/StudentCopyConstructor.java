package practice.Constructors;

public class StudentCopyConstructor {
        int id;  
        String name;  
    
        StudentCopyConstructor(int i,String n){  
        id = i;  
        name = n;  
        }  
    
        StudentCopyConstructor(StudentCopyConstructor s1)           //constructor to initialize another object  
    {  
        id = s1.id;  
        name =s1.name;  
        }  
        public StudentCopyConstructor() {
        }

        void display(){System.out.println(id+" "+name);}  
       
        public static void main(String args[]){  

            //copying by constructor
            System.out.println("copying by constructor");
            StudentCopyConstructor s1 = new StudentCopyConstructor(111,"Karan");  
            StudentCopyConstructor s2 = new StudentCopyConstructor(s1);  
        s1.display();  
        s2.display();  


        //without constructor i.e assigning values
        System.out.println("copying without constructor i.e by  assigning values");
        StudentCopyConstructor s3 = new StudentCopyConstructor(111,"Karan");  
        StudentCopyConstructor s4 = new StudentCopyConstructor();  
        s4.id=s3.id;  
	    s4.name=s3.name;  

    s3.display();  
    s4.display();
       }  
    }  
    
    

