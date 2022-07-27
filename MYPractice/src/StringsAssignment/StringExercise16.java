package StringsAssignment;

import java.util.Scanner;
public class StringExercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = validate(sc);
        sc.close();
        System.out.println(s1);
        String str = s1.toUpperCase();
        System.out.println(str);
    }

    static String validate(Scanner scannerObj){ //validate method definition
        String st;
        do{
            System.out.println("Enter a sentence");
            while(!scannerObj.hasNext("[A-Za-z]*")){
                System.out.println("This is not a String.Please enter valid String:");
                scannerObj.next();
            }
            st = scannerObj.nextLine();
        }while(st.equals(""));
      return st;
    }
}
