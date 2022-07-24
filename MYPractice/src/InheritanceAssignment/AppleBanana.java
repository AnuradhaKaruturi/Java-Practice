package InheritanceAssignment;

class Apple {
    int numberOfItems = 5;
}

class Banana extends Apple {
    int numberOfItems = 8;

    public Banana() {
        System.out.println("Banana Constructor");
    }

    public void show() {
        System.out.println("no of Banana's : " + numberOfItems);
        System.out.println("no of apple's : " + super.numberOfItems);
    }
}
public class AppleBanana {
    public static void main(String[] args) {
        Banana bObj = new Banana();
        bObj.show();
    }
    
}
