package practice.TypeCasting;


class Vehicle{
    String veh = "train";
    void speed(){
        System.out.println("Inside Vehicle");
    }
}

class Bike extends Vehicle {
    void speed(){
        int bikespeed = 100;
        System.out.println("Inside of Bike Speed"+ bikespeed+" KMPH");
        
    }

}

class electricBike extends Bike implements SpeedLimit{
    public void speed(){
        int electricBikespeed = 100;
        System.out.println("Inside of electricBike  Speed"+ electricBikespeed+" KMPH");
    }

    @Override
    public void TankCapacity() {
        int capacity = 60;
       System.out.println("Inside of electric Bike TankCapacity"+ capacity+"Litres"); 
    }

}

interface SpeedLimit{
    void speed();

    void TankCapacity();
}

public class referenceCasting {

    public static void main(String[] args) {
        electricBike ebike = new electricBike();
        ebike.TankCapacity();
        ebike.speed();
        Vehicle ve = new Vehicle();
        ve.speed();
        Vehicle veh = ebike;
        veh.speed();
        Bike bik = new Bike();
        bik.speed();
        electricBike eb = new electricBike();
        System.out.println(eb.veh);
        Bike bike = (Bike) veh;
        bike.speed();
        
    }
    
}
