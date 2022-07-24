package ClassObjectAssignment;
import java.util.Scanner;
public class Complex {
    double real,img;
       public void getData(Scanner sc){
            System.out.println("enter values for A and B for complex number ");
            real = sc.nextDouble();
            img = sc.nextDouble();
        }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Complex c1 = new Complex();
    c1.getData(sc);
    Complex c2 = new Complex();
    c2.getData(sc);
    Complex temp = sum(c1, c2);
    System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
    Complex temp1 = diff(c1, c2);
    System.out.println("Difference  is: "+ temp1.real+" + "+ temp1.img +"i");
    Complex temp2 = product(c1, c2);
    System.out.println("Product is: "+ temp2.real+" + "+ temp2.img +"i");
    sc.close();
   }   
   public static Complex sum(Complex n1,Complex n2){
        Complex temp = new Complex();
        temp.real = n1.real + n2.real;
        temp.img = n1.img + n2.img;
        return temp;
    }
    public static Complex diff(Complex n1 ,Complex n2){
        Complex temp = new Complex();
        temp.real = n1.real - n2.real;
        temp.img = n1.img - n2.img;
        return temp;
    }
    public static Complex product(Complex n1 ,Complex n2){
        Complex temp = new Complex();
        temp.real = n1.real * n2.real;
        temp.img = n1.img * n2.img;
        return temp;
    }
}

