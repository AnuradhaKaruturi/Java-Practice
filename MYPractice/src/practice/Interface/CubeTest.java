package practice.Interface;

//protected interface inside class
class Cube 
{ 
  protected interface Number 
  { 
    public void calculateCube(int n); 
    default int area(int n){
        return n*n;
    }
    static void display(){
        System.out.println("Display in Interface");
    }
  }
} 

 class Five implements Cube.Number 
{ 
  public void calculateCube(int n)
  { 
    int cubeN = n * n * n; 
    System.out.println("Cube of 5: " +cubeN); 
   } 
} 

 class Ten implements Cube.Number 
{ 
  public void calculateCube(int n)
  { 
    int cubeN = n * n * n; 
    System.out.println("Cube of 10: " +cubeN); 
   } 
} 

public class CubeTest 
{ 
  public static void main(String[] args) 
  { 
    Five f = new Five(); 
     f.calculateCube(5); 
     f.area(5);

     Cube.Number.display();

    Ten t = new Ten(); 
     t.calculateCube(10); 
     t.area(10);
  } 
}

