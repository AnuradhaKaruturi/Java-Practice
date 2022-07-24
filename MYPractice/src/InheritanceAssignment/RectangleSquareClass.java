package InheritanceAssignment;
class RectangleClass {
    int length;
    int breadth;

    public void Area() {
        int Area = length * breadth;
        System.out.println("Area Of The Rectangle: " + Area);
    }

    public void Perimeter() {
        int Perimeter = (length + breadth) * 2;
        System.out.println("Perimeter Of The Rectangle: " + Perimeter);
    }

     RectangleClass(int l ,int b){
      this.length = l;
      this.breadth = b;
     }
    
}

class Square extends RectangleClass{
 int side;

 Square(int s){
    super(5,7);
    this.side = s;
 }
 public void Area() {
    super.Area();
    int Area = side * side;
    System.out.println("Area Of The Square: " + Area);
}

public void Perimeter() {
    super.Perimeter();
    int Perimeter = 4 * side;
    System.out.println("Perimeter Of The Square: " + Perimeter);
}

}
public class RectangleSquareClass{
    public static void main(String[] args) {
        Square squObj = new Square(5);
        squObj.Area();
        squObj.Perimeter();
    }
}