package InheritanceAssignment;
class RectangleClass2 {
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

     RectangleClass2(int l ,int b){
      this.length = l;
      this.breadth = b;
     }
    
}

class Square2 extends RectangleClass2{
 int side;

 Square2(int s){
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
public class RectangleSquare2{
    public static void main(String[] args) {
        Square2 squObj[]=new Square2[10];
        for(int i=0 ;i<10;i++){
            squObj[i]=new Square2(i+2); 
            squObj[i].Area();
            squObj[i].Perimeter();
        }
       
    }
}
