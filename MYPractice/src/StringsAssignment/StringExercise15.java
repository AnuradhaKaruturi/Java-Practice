package StringsAssignment;

import java.util.Scanner;
public class StringExercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = validate(sc);
        sc.close();
        capitalizeFirstLetter(s1);
    }

    private static void capitalizeFirstLetter(String s1) {
   
        String[] str = s1.split(" ");
        String newStr = "";
        for(String s:str){
            String first = s.substring(0,1);      //First Letter
            String rest = s.substring(1);       //Rest of the letters
            //Concatenete and reassign after converting the first letter to uppercase
            newStr += first.toUpperCase()+rest+" ";      
        }
        //trim to remove the last redundant blank space
        System.out.println(newStr.trim());
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