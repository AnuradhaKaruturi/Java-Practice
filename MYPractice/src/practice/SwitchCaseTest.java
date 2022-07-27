package practice;
import java.util.Scanner;
public class SwitchCaseTest {
    int abc = 30;
    String fix = "fixing_abc";
    static String zx = "asdfg";
    private static final String A_IS_LESSER_THAN_5 = "A is lesser than 5";
    public  static int sum(int a, int b){
      return a+b;
    }

    public static void main(String[] args) {
        SwitchCaseTest obj = new SwitchCaseTest();
        System.out.println("Enter  Any  choice from 1 to 8  ");
        Scanner scan = new Scanner(System.in);
        int exp = scan.nextInt();
        switch(exp){
            case 1:
              System.out.println("Entered choice is 1");
              int a = 1;
              if( a > 5){System.out.println("A is greater than 5");}
              else {System.out.println(A_IS_LESSER_THAN_5);}
              break;
            case 2:
              System.out.println("Entered choice is 2");
              System.out.println(obj.abc);
              break;
            case 3:
              System.out.println("Entered choice is 3");
              System.out.println(zx);
              break;
            case 4:
              System.out.println("Entered choice is 4 and enter another value for a to d :");
              char ch = scan.next().charAt(0);
              switch(ch){
                  case 'a','d':
                     System.out.println("A is Entered");
                     break;
                  case 'b':
                     System.out.println("B is Entered");
                     break;
                   case 'c':
                     System.out.println("C is Entered");
                     break;
                    default:
                    System.out.println("Incorrect choice");
              }
              break;
            case 5:
              System.out.println("Entered choice is 5");
              int s = 25, r = 50;
              int add = sum(s,r);
              System.out.println(add);
              break;
             default:
              System.out.println("Its a default Case");  
        }
        scan.close();
    }

    
    
}
