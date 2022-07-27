package StringsAssignment;

import java.util.Scanner;
public class StringExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = StringExercise2.validate(sc);
        sc.close();
        lexicographicSort(s);
        
        
    }
    public static void lexicographicSort(String s){
        String[] str = s.split(" ");
        for(int i = 0;i<str.length;i++){
            for(int j = i+1;j<str.length;j++){
                if (str[i].compareToIgnoreCase(str[j]) > 0) {
                     String temp = str[i];
                     str[i]= str[j];
                     str[j] = temp;
                      }
             }  
         }
         System.out.println("lexicographic order : ");
          for(int i = 0; i<str.length;i++){
           System.out.print(str[i]+" ");
          }
    }



    static String validate(Scanner scannerObj){ //validate method definition
        String st;
        do{
            System.out.println("Enter sentence");
            while(!scannerObj.hasNext("[A-Za-z]*")){
                System.out.println("This is not a String.Please enter valid String:");
                scannerObj.next();
            }
            st = scannerObj.nextLine();
        }while(st.equals(""));
      return st;
    }
}
