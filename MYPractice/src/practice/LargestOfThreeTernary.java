package practice;
public class LargestOfThreeTernary {
    int output = 100;
    public static void main(String[] args)
    {
        int a = 20, b = 10, c = 30, result;
 //Example for nested ternary Operators
        // result holds max of three
        // numbers
        result = ((a > b)
                      ? (a > c)
                            ? a
                            : c
                      : (b > c)
                            ? b
                            : c);
        System.out.println("Max of three numbers = "
                           + result);
    }
    
}
