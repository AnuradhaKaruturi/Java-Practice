package ClassObjectAssignment;
public class Triangle2 {
    int a,b,c;

    public static void main(String[] args) {
        new Triangle2(3,4,5); 
     }
     Triangle2(int a,int b,int c){
         this.a = a;
         this.b = b;
         this.c = c;
         System.out.println("area of triangle is: "+a*b*c);
         System.out.println("perimeter of triangle is: "+(a+b+c));
     }
}
