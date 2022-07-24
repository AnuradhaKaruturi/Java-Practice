package Java8;

 interface Vehicle {

    void type();

    default void print() {
       System.out.println("I am a vehicle!");
    }
 }
 
 interface TwoWheeler {
 
    default void print() {
       System.out.println("I am a Two wheeler!");
    }
 }
 


public class DefaultMethodDemo implements Vehicle , TwoWheeler {
    public static void main(String[] args) {
        DefaultMethodDemo car = new DefaultMethodDemo();
        car.print();  
    }

    //create an own method that overrides the default implementation.
    public void print() {
        System.out.println("I am a four wheeler!");

        //call the default method of the specified interface using super.
        Vehicle.super.print();
        TwoWheeler.super.print();
     }

    

    @Override
    public void type() {
        System.out.println("Four Wheeler");  
    }

}
