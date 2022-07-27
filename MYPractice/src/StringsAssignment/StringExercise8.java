package StringsAssignment;

import java.util.Scanner;
public class StringExercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numeric or non-numeric String");
        String s = sc.nextLine();
        sc.close();
        if(isNumeric(s)) { 
            System.out.println("String is numeric!");
        } else {
            System.out.println("String is not numeric.");
        }
}

public static boolean isNumeric(String string) {
    System.out.println(String.format("Parsing string: \"%s\"", string));
		
    if(string == null || string.equals("")) {
        System.out.println("String cannot be parsed, it is null or empty.");
        return false;
    }
    
    try {
         Double.parseDouble(string);
     //   String regex = "[0-9]+[\\.]?[0-9]*";
     //   return Pattern.matches(regex, string);
        return true;
    } catch (NumberFormatException e) {
        System.out.println("Input String cannot be parsed to Numeric.");
    }
    return false;

}
}
