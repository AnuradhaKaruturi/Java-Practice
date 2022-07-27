package practice;
class LocalInner2{  
    private int data=30;//instance variable  
   
    void display(){  
     int value=50;//local variable must be final till jdk 1.7 only  
     class Local{    //declared within a block ,can be abstract or final only
     //    int num = 50;
      void msg(){System.out.println(value);
        System.out.println(data);  //local class can ascess data members of enclosed class
    }  
     }  
     Local l = new Local();  
     l.msg();  
     
    }  
    public static void main(String args[]){  
     LocalInner2 obj=new LocalInner2();  
     obj.display();  
    }  
   }  
