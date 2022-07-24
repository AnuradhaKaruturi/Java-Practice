package AbstractionAssignment;
abstract class Shape1{
    abstract double rectangleArea(float l,float b);
    abstract double square(float s);
    abstract double circle(float r);
}

class Area extends Shape1{

    double rectangleArea(float l,float b){
        return l*b;
    }

    double square(float s){
        return s*s;
    }

    double circle(float r){
        return 3.14*r*r;
    }

}

public class AbstractionAssignment6 {
    public static void main(String[] args) {

        Area areaObj = new Area();
      System.out.println(areaObj.rectangleArea(5, 7));
       System.out.println(areaObj.square(8));
       System.out.println(areaObj.circle(3));
        
    }
}
