package ClassObjectAssignment;
public class Rectangle {
    int a,b;

    public static void main(String[] args) {
        new Rectangle(4,5); 
        new Rectangle(5,8);
     }
     void Area(int a ,int b)
     {
         System.out.println("Area of rectangle with length "+a+" and breadth "+b+" is "+a*b);
     }
     Rectangle(int a,int b){
         this.a = a;
         this.b = b;
        this.Area(a, b);
        
     }
    
}