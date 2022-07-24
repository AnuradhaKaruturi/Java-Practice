package practice.ENUM;

enum  Vehicle{
    CAR , BIKE, PLANE,SHIP    
}

public class enumDemo {
    public static void main(String[] args) {
        Vehicle car = Vehicle.CAR;
        System.out.println(car);
        Vehicle arr[] = Vehicle.values();
        for(Vehicle v : arr){
        System.out.println(v);
        }
        System.out.println(Vehicle.valueOf("BIKE"));
    }
    
}
