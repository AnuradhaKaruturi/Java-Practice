package StringsAssignment;

import java.util.Scanner;

public class StringExercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = validate(sc);
        sc.close();
        characterCount(str);

    }

    static void characterCount(String str) {
        str = str.toLowerCase();
        int vow = 0, con = 0, dig = 0, sp = 0, sym = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o') {
                ++vow;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++con;
            } else if (ch >= '0' && ch <= '9') {
                ++dig;
            } else if (ch == ' ') {
                ++sp;
            } else
                ++sym;
        }
        System.out.println("Count of vowels is :" + vow);
        System.out.println("Count of  Constants is:" + con);
        System.out.println("Count of digits is :" + dig);
        System.out.println("Count of Spaces is:" + sp);
        System.out.println("Count of special Characters is:" + sym);
    }

    static String validate(Scanner scannerObj) { // validate method definition
        String st;
        do {
            System.out.println("Enter String:");
            while (!scannerObj.hasNext("[A-Za-z]*")) {
                System.out.println("This is not a String.Please enter valid String:");
                scannerObj.next();
            }
            st = scannerObj.nextLine();
        } while (st.equals(""));
        return st;
    }
}
