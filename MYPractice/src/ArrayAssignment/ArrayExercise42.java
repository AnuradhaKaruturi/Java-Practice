
package ArrayAssignment;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise42 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //char to string
        System.out.println("Enter a character to convert it to String");
        char c = sc.next().charAt(0); 
        String st = Character.toString(c);
        // st = String.valueOf(c);
        System.out.println("The string is: " + st);

        //char Array to string

        char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String str = String.valueOf(ch);
       // String st2 = new String(ch);

        System.out.println("The string is: " +str);
       // System.out.println(st2);

        //string to char array
        System.out.println("Enter a string to convert it to charArray");
     
        String string = sc.next();

        char[] chars = string.toCharArray();
        System.out.print(Arrays.toString(chars)+" ");
        sc.close();
    }
}
