package InheritanceAssignment;
class A{
  int i;
  int j;

  void show(){
   System.out.println("values of i and j are :"+ i +" " + j);
  }

}
class B extends A{
    int k;
  B(){
  }
    void Show(){
        System.out.println("value of k is :"+k);
    }

}

public class ClassAB {
    public static void main(String[] args) {
        B b = new B();
        b.Show();
        
    }
}
