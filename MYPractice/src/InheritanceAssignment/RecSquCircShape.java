package InheritanceAssignment;
class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle1 extends Shape {
    public void printRectangle() {
        System.out.println("This is Rectangle");
    }
}

class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is Circle");
    }
}

class Square1 extends Rectangle1 {
    public void printSquare() {
        System.out.println("Square is a Rectangle");
    }
}
 public class RecSquCircShape{
     public static void main(String[] args) {
         Square1 sqObj = new Square1();
         sqObj.printShape();
         sqObj.printRectangle();   
     }
 }

    
