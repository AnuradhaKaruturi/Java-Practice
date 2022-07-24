package InterfaceAssignment;
interface Vehicles{
    void print();
}

public class Exercise8  {
    public int no_of_wheels() {
        return 4;
    }
    
     Vehicles display() {
           System.out.println("Vehicle interface abstract method implementation");
 
           class innerExer8 implements Vehicles   {
               int num = 20;

               void innerDisplay(){
                   System.out.println("inside innerClass method"+num);
               }
              
              public void print() {
                System.out.println("Print method");
                
              }
           }
           innerExer8 inObj = new innerExer8();
           inObj.innerDisplay();
          Vehicles veh = new innerExer8();
          return veh;
    }
  public static void main(String[] args) {

    Exercise8 obj = new Exercise8();
  //  innerExer8 inObj = obj.new innerExer8();   this class is not visible outside the display method
     System.out.println(obj.display());
    System.out.println("Num of wheels "+ obj.no_of_wheels());  
  }

    
}
