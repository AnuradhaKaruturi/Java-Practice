package StringsAssignment;

import java.util.Scanner;
public class StringExercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = validate(sc);
        System.out.println("Entered String is :"+str+"\n"+"Length of the String is :"+str.length());  
    }

    static String validate(Scanner scannerObj){ //validate method definition
        String st;
        do{
            while(!scannerObj.hasNext("[A-Za-z]*")){
                System.out.println("This is not a String.Please enter valid String:");
                scannerObj.next();
            }
            st = scannerObj.nextLine();
        }while(st.equals(""));
      return st;
    }
    
}
