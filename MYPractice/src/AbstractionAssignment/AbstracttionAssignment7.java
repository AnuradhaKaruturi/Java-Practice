package AbstractionAssignment;
abstract class Shape2{
   
    protected boolean filled = true;   
    protected String color = "red";

    public boolean isFilled() 
    {
    return filled;
    }

    public void setFilled(boolean filled)
    {
    this.filled = filled;
    }

    public String getColor()
    {
    return color;
    }

   public void setColor(String color)
    {
    this.color = color;
    }


   public  Shape2()
   {

   }
   
   public Shape2(String color, boolean filled)
    {
    this.color = color;
    this.filled = filled;
    }

     public String toString() {
    return "Shape2 [color=" + color + ", filled=" + filled + "]";
}

    abstract double getArea();
    abstract double getPerimeter();
    
   
}

class Circle2 extends Shape2{

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle2 [Shape2 [color=" + color + ", filled=" + filled + "],radius=" + radius + "]";
    }

    double radius = 1.0;
    
    Circle2()
    {

    }
   
    Circle2(double radius)
    {
        this.radius = radius;

    }

    Circle2(double radius,String color,boolean filled)
    {
       this.radius = radius;
       this.color = color;
       this.filled = filled;
    }


    double getArea() {
       
        return 3.14*radius*radius;
    }

    double getPerimeter() {
        
        return 2*3.14*radius;
    }

}

class Rectangle2 extends Shape2{

    double width = 1.0;
    double length = 1.0;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    
    
    Rectangle2()
    {
        
    }

    Rectangle2(double width,double length)
    {
       this.width = width;
       this.length = length;
    }

    Rectangle2(double width,double length,String color,boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    
    double getArea() {
        
        return width*length;
    }

    
    double getPerimeter() {
       
        return 2*(width+length);
    }

    public String toString() {
        return "Rectangle2 [Shape2 [color=" + color + ", filled=" + filled + "],length=" + length + ", width=" + width + "]";
    }
   
}
class Square3 extends Rectangle2{

    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setLength(double length) {
        this.length = length;
    } 

    Square3()
    {

    }

    Square3(double side)
    {
       this.side = side; 
    }

    Square3(double side, String color,boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
        
    }

    public String toString() {
        return "Square3 [Rectangle2 [Shape2 [color=" + color + ", filled=" + filled + "],length=" + length + ", width=" + width + "]";
    }

}
public class AbstracttionAssignment7 {

    public static void main(String[] args) {

        
        Circle2 cirObj = new Circle2();
        System.out.println("Area of Circle : " + cirObj.getArea());
        System.out.println("perimeter of circle : " + cirObj.getPerimeter());

        Circle2 cirObj1 = new Circle2(5.0);
        System.out.println("Area of Circle : " + cirObj1.getArea());
        System.out.println("perimeter of circle : " + cirObj1.getPerimeter());


        Circle2 cirObj2 = new Circle2(4, "Green", false);
        System.out.println("Area of Circle : " + cirObj2.getArea());
        System.out.println("perimeter of circle : " + cirObj2.getPerimeter());
        System.out.println("color : " + cirObj2.getColor());
        System.out.println("filled : " + cirObj2.isFilled());

        Rectangle2 recObj = new Rectangle2();
        System.out.println("Area of Rectangle : " + recObj.getArea());
        System.out.println("Perimeter of rectangle : " + recObj.getPerimeter());

        Rectangle2 recObj1 = new Rectangle2(2.5, 3.5);
        System.out.println("Area of Rectangle : " + recObj1.getArea() );
        System.out.println("Perimeter of rectangle : " + recObj1.getPerimeter());

        Rectangle2 recObj2 = new Rectangle2(3.5, 4.25, "purple", true);
        System.out.println("Area of Rectangle : " + recObj2.getArea()); 
        System.out.println("Perimeter of rectangle : " + recObj2.getPerimeter());
        System.out.println("color : " + recObj2.getColor() );
        System.out.println("filled : " + recObj2.isFilled());

        Square3 squObj = new Square3();
        System.out.println("Area using Square obj "+ squObj.getArea());
        System.out.println("Perimeter using Square obj "+  squObj.getPerimeter());

        
    }
    
}
