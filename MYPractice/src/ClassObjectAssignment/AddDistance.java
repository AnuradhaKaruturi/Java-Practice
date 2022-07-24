package ClassObjectAssignment;

import java.util.Scanner;
public class AddDistance {
    double inch;
    double feet;
        void getData(Scanner sc){
        System.out.println("Enter the Distance in Inch's :");
        this.inch = sc.nextDouble();        
    }
    double inchToFeet(){
        this.feet = (0.0833 * this.inch);
        return feet;
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AddDistance d1 = new AddDistance();
        d1.getData(sc);
        AddDistance d2 = new AddDistance();
        d2.getData(sc);
        double a = d1.inchToFeet();
        double b = d2.inchToFeet();
        double sumOfDistances = a+b;
        System.out.println("Sum of Distances in Feet :"+sumOfDistances);

        sc.close();

    } 
}
