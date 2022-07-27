package StringsAssignment;
import java.util.Scanner;

public class StringExercise34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter rotation str of above string:");
        String rotstr = sc.next();
        sc.close();
        if(str.length() != rotstr.length()){  
            System.out.println("Second string is not a rotation of first string");  
        }  
        else {  
            //Concatenate str1 with str1 and store it in str1  
            str = str.concat(str);  

            if(str.indexOf(rotstr)!= -1)
                System.out.println("Second string is a rotation of first string");  
            else  
                System.out.println("Second string is not a rotation of first string");  
            
        }
    }
}
