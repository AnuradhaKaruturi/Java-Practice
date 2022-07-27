package StringsAssignment;

import java.util.Scanner;
public class StringExercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = validate(sc);
        sc.close();
        characterCount(str);
      
    }

    static void characterCount(String str)
    {
        int vow = 0,con = 0;
        for(int i = 0;i<str.length();i++){

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i)== 'o' || str.charAt(i) == 'u' ||
            str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' ) {
              vow++;
              }
              else if((str.charAt(i)>='a'&& str.charAt(i)<='z') || (str.charAt(i)>='A'&& str.charAt(i)<='Z'))
              {
             con++;
              }
        }
        System.out.println("Count of vowels is :"+vow);
        System.out.println("Count of  Constants is:"+con);
       // System.out.println("Count of digits is :"+dig);
       // System.out.println("Count of Spaces is:"+sp);
       // System.out.println("Count of special Characters is:"+ch);
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

