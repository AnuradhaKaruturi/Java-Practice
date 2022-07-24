package InterfaceAssignment;
interface FastFood {
    void starter();
    void  mainCourse();
}

class Sandwich implements FastFood {
    public void starter() {
        System.out.println("Noodles");
    }

    public void mainCourse() {
      System.out.println("Biryani"); 
    }
    

}

public class Exercise5 {

    public static void main(String[] args) {
        FastFood obj = new Sandwich();
        obj.starter();
        obj.mainCourse();
    }
}
