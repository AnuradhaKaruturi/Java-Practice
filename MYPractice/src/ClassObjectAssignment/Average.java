package ClassObjectAssignment;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Average avg = new Average();
        System.out.println("Enter 3 values to find average: ");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        avg.calculate(a,b,c);
        obj.close();
    }
     void calculate(int a,int b,int c)
    {
        int average = (a+b+c)/3;
        System.out.println("The average of 3 numbers is:"+average);
    }
    
}
