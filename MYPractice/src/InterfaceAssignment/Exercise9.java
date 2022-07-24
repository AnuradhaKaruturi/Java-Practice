package InterfaceAssignment;

interface Shapes{
    void draw();
    double getArea();
    public boolean fitsText(String message);

}

class Circles implements Shapes{
    double radius;
    String color;

    Circles(double radius ){
        this.radius = radius;
    }
	
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	public double getArea(){
		return Math.PI*this.radius*this.radius;
	}

	public String getColor(){
        color = "Blue";
		return this.color;
	}
    public boolean fitsText(String message) {
        return message.length() < (2 * this.radius);
      }

}

class Rectangles implements Shapes{
    double length,width;
    String color;
        Rectangles(double length,double width){
            this.length = length;
            this.width = width;
        }
       
        public void draw() {
            System.out.println("Drawing Rectangle");
            
        }
     
        public double getArea() {
            return this.length*this.width;
        }

        public String getColor(){
            color = "yellow";
            return this.color;
        } 

        public boolean fitsText(String message) {
            return message.length() < this.width;
          }

}

class Sign {
    Shapes shape;
    String text;
    
    public void print() {
       System.out.println("Shape :"+shape +"\n"+ "Text :"+text);
    }

    Sign(Shapes shape,String text){
        this.shape = shape;
        this.text = text;
    }
  
  }
public class Exercise9 {

   static void fitOrNot(boolean bool)
       {
           if(bool == true)
           {
               System.out.println("Message fits into Shape perfectly");
           }
           else{
               System.out.println("Message does not fits into the Shape ");
           }

       }
   

    public static void main(String[] args) {
        Circles cirObj = new Circles(7);
        cirObj.draw();
        System.out.println(cirObj.getArea());
        fitOrNot(cirObj.fitsText("Circle"));
        System.out.println("Circle color is :"+cirObj.getColor());

        Rectangles recObj = new Rectangles(10, 20);
        recObj.draw();
       System.out.println(recObj.getArea());
       fitOrNot(recObj.fitsText("Rectangle"));
       System.out.println("Rectangle color is :"+recObj.getColor());

       Sign signObj = new Sign(cirObj,"Left");
       signObj.print();

       Sign signObj1 = new Sign(recObj,"Right");
       signObj1.print();

        
    }
    
}
