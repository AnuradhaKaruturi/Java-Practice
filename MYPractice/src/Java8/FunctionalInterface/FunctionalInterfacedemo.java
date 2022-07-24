package Java8.FunctionalInterface;

@FunctionalInterface

interface user {

    public void add(int a , int b); //only one SAM

  
      String toString();

      int hashCode();



    public default void printText(String text) {
        System.out.println(text);
      }

      public static void printName(String text)  {
       System.out.println(text);
      }

}
public class FunctionalInterfacedemo  implements user{

  public static void main(String[] args) {
    user.printName("Anu");
    FunctionalInterfacedemo demo = new FunctionalInterfacedemo();
    demo.printText("Welcome to Default Method");
  }

  @Override
  public void add(int a, int b) {
    System.out.println(a+b); 
  }
    
}
