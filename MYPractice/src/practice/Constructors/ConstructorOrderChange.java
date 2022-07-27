package practice.Constructors;

public class ConstructorOrderChange {

     ConstructorOrderChange()
    {
          System.out.println("Default constructor");
    }
    ConstructorOrderChange(int x)
    {
          this();
          System.out.println("One-argument constructor");
          System.out.println(x);
    }
    ConstructorOrderChange(int x, int y)
    {
          this(5);
          System.out.println("Two-argument constructor");
          System.out.println(x * y);
    }
    public static void main(String args[ ])
    {
    new ConstructorOrderChange(8, 10);
    }
    }
 
    
 //   Code after changing the order of constructors:
    class ConstructorOrderChange2
    {
        ConstructorOrderChange2()
        {
            this(5);
            System.out.println("The Default constructor");
        }
        ConstructorOrderChange2(int x)
        {
            this(5, 15);
            System.out.println("One-argument constructor");
            System.out.println(x);
        }
        ConstructorOrderChange2(int x, int y)
        {
            System.out.println("Two-argument constructor");
            System.out.println(x * y);
        }
    public static void main(String args[])
    {
    new ConstructorOrderChange2();
    }
    }
    
