package ClassObjectAssignment;
public class Triangle {
    public static void main(String[] args) {
       new Triangle(); 
    }
    Triangle(){
        int a = 3 ,b = 4,c = 5;
        System.out.println("area of triangle is: "+a*b*c);
        System.out.println("perimeter of triangle is: "+(a+b+c));
    }
}
