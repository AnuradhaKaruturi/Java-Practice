package StringsAssignment;

import java.util.Scanner;
public class StringExercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String or Sentence");
        String s1 = validate(sc);
        System.out.println("Enter a substring:");
        String s2 = validate(sc);
        sc.close();
        System.out.println("entered string and substring  is ;"+s1+"\n"+s2);
        indexOfSubstring(s1,s2);  
    }
    
    public static void  indexOfSubstring(String s,String sub){
        if(s.indexOf(sub)!= -1){
            System.out.println("The entered subString \""+sub+"\" is present in String \""+s+"\"");
        }
        else{
            System.out.println("The entered subString "+sub+" is not present in String "+s);
        }
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


