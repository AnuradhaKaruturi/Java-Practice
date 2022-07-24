


interface RegularPolygon{

    int getNumSides();
    int getSideLength();
  /*  static int totalSides(){
        return 
    }
*/
default void getPerimeter(int num, double length) {
    System.out.println("Perimeter : "+num * length);
}
default void getInteriorAngle(int num, double radius) {
    System.out.println("Interior Angle :"+(((num) - 2) * (Math.PI) / radius) * 2);
}

}
class EquilateralTriangle implements RegularPolygon{
    int length ;

    EquilateralTriangle(){
      length = 6;
    }
    public int getNumSides(){
        return 3;
    }
    public int getSideLength(){
      return length;
    }
    
}
class SquarePolygon implements RegularPolygon{
    int length;
    
    SquarePolygon(){
     length = 10;
    }
    public int getNumSides(){
        return 4;
    }
    public int getSideLength(){
      return length;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        EquilateralTriangle triObj = new EquilateralTriangle();
        System.out.println(triObj.getNumSides() + "\n" + triObj.getSideLength());
        triObj.getPerimeter(3, 5);
        triObj.getInteriorAngle(4, 7.5);

        SquarePolygon sqObj = new SquarePolygon();
        System.out.println(sqObj.getNumSides() + "\n" + sqObj.getSideLength());
        triObj.getPerimeter(4,6 );
        triObj.getInteriorAngle(6, 10);

    }
    
}
