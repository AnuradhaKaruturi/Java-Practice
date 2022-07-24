package ClassObjectAssignment;
import java.util.Scanner;
public class AreaofRectangle {
  int a;
  int b;
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        AreaofRectangle rec = new AreaofRectangle();
        System.out.println("Enter length and breadth ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        rec.setDim(a,b);
        obj.close();
    }

   void setDim(int a2, int b2) {
    a = a2;
    b = b2;
    int area = getArea(a,b);
   System.out.println("Area of Rectangle is "+area);
    }

 int getArea(int a,int b){
    return a*b;
}
}