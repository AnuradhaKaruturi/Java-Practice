package AbstractionAssignment;

abstract class Animals{

    abstract void cats();
    abstract void dogs();

}

class Cats extends Animals{
    void cats(){
        System.out.println("Cats Meow");
    }

    void dogs() {
        System.out.println();   
    }
}

class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs Bark");
    }
    void cats() {
      System.out.println();   
    }
} 

public class AbstarctionAssignment5 {
    public static void main(String[] args) {
        Cats catObj = new Cats();
        Dogs dogObj = new Dogs();
        catObj.cats();
        dogObj.dogs();
        
    }
}
