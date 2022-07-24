package ClassObjectAssignment;
import java.util.Scanner;
public class AreaofRectangle2 {
 static int a;
 static int b;
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length and breadth ");
        int a = obj.nextInt();
        int b = obj.nextInt();
       new AreaofRectangle2(a,b);
        obj.close();
    }
    AreaofRectangle2(int a,int b){
        AreaofRectangle2.a = a;
        AreaofRectangle2.b = b;
       int area =  returnArea(a,b);
       System.out.println("area of rectangle is :"+area);
    }
   int returnArea(int a1,int b1)
   {
       return a1*b1;
   }
}